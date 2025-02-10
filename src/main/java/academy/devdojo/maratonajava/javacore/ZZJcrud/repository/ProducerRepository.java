package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;


import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
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
public class ProducerRepository {
    public static List<Producer> findByName(String name) {
        log.info("Finding producers by name '{}'", name);
        List<Producer> producerList = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(connection, name);// Abstrair para um metodo fora, para utilizar o autocloseable
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
                producerList.add(producer);
            }
            log.info("SELECTED ALL producer from  DATA_BASE ");
            return producerList;

        } catch (SQLException e) {
            log.error("Error while to trying to find all data from database");
        }
        return producerList;
    }

    public static PreparedStatement createPreparedStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE name like ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }
    public static Optional<Producer> findById(Integer id){
        log.info("Finding the producer by id '{}'",id);
        try (Connection conn = ConnectionFactory.getConnection();
        PreparedStatement ps = createPreparedStatementfindById(conn, id);
        ResultSet rs = ps.executeQuery();){
        if (!rs.next()) return Optional.empty();
        return Optional.of(Producer.builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build());

        } catch (SQLException e) {
            log.error("Error trying to FindById", e);
        }
        return Optional.empty();
    }
    public static PreparedStatement createPreparedStatementfindById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }


    public static void delete(int id) {
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementDelete(connection, id)) {
            ps.execute();
            log.info("Deleted producer  '{}' ", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer with id  '{}'", id, e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, Integer i) throws SQLException {
        String sql = "DELETE FROM anime_store.producer WHERE id=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, i);
        return ps;
    }

    public static void saveProducer(Producer producer) {
        log.info("Saving producer '{}'", producer.getName());
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = createSavePrepareStatement(connection, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error to trying updated producer name with id '{}'", producer.getId());
        }
    }

    public static PreparedStatement createSavePrepareStatement(Connection connection, Producer producer) throws SQLException {
        String sql = "INSERT INTO anime_store.producer (name) VALUES (?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

    public static void update(Producer producer) {
        log.info("Update the producer '{}'", producer.getName());
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = createUpdatePrepareStatement(connection, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Erro while trying update producer", e);
        }

    }

    private static PreparedStatement createUpdatePrepareStatement(Connection connection, Producer producer) throws SQLException {
        String sql = "UPDATE anime_store.producer SET name=? WHERE id=?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }


}
