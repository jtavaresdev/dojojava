package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;


import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Log4j2
public class AnimeRepository {
    public static List<Anime> findByName(String name) {
        log.info("Finding animes by name '{}'", name);
        List<Anime> animeList = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(connection, name);// Abstrair para um metodo fora, para utilizar o autocloseable
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .name(rs.getString("producer_name"))
                        .id(rs.getInt("producer_id")).build();
                Anime anime = Anime.builder().
                        id(rs.getInt("id")).
                        name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                animeList.add(anime);
            }
            log.info("SELECTED ALL Anime from  DATA_BASE ");
            return animeList;

        } catch (SQLException e) {
            log.error("Error while to trying to find all data from database");
        }
        return animeList;
    }

    public static PreparedStatement createPreparedStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = """ 
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name', p.id as "producer_id" FROM anime_store.anime a INNER JOIN
                anime_store.producer p on a.producer_id = p.id
                WHERE a.name like ?;
                """;
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static Optional<Anime> findById(Integer id) {
        log.info("Finding the Anime by id '{}'", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementfindById(conn, id);
             ResultSet rs = ps.executeQuery();) {
            if (!rs.next()) return Optional.empty();

            Producer producer = Producer.builder()
                    .name(rs.getString("producer_name"))
                    .id(rs.getInt("producer_id")).build();

            return Optional.of(Anime.builder().
                    id(rs.getInt("id")).
                    name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build());

        } catch (SQLException e) {
            log.error("Error trying to FindById", e);
        }
        return Optional.empty();
    }

    public static PreparedStatement createPreparedStatementfindById(Connection conn, Integer id) throws SQLException {
        String sql = """ 
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name', p.id as "producer_id" FROM anime_store.anime a INNER JOIN
                anime_store.producer p on a.producer_id = p.id
                WHERE a.id like ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }


    public static void delete(int id) {
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementDelete(connection, id)) {
            ps.execute();
            log.info("Deleted Anime  '{}' ", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete Anime with id  '{}'", id, e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, Integer i) throws SQLException {
        String sql = "DELETE FROM anime_store.anime WHERE id=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, i);
        return ps;
    }

    public static void saveProducer(Anime anime) {
        log.info("Saving Anime '{}'", anime.getName());
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = createSavePrepareStatement(connection, anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error to trying updated Anime name with id '{}'", anime.getId());
        }
    }

    public static PreparedStatement createSavePrepareStatement(Connection connection, Anime anime) throws SQLException {
        String sql = "INSERT INTO anime_store.anime (name,episodes,producer_id) VALUES (?,?,?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setObject(3, anime.getProducer().getId());
        return ps;
    }

    public static void update(Anime anime) {
        log.info("Update the Anime '{}'", anime.getName());
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = createUpdatePrepareStatement(connection, anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Erro while trying update Anime", e);
        }

    }

    private static PreparedStatement createUpdatePrepareStatement(Connection connection, Anime anime) throws SQLException {
        String sql = "UPDATE anime_store.anime SET name=?, episodes=? WHERE id=?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2,anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }

}
