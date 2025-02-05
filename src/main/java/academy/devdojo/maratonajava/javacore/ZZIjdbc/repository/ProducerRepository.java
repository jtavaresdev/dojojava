package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = String.format("INSERT INTO anime_store.producer (name) VALUES ('%s');", producer.getName());
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {
            int execute = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database rows affected {}", producer.getName(), execute);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }
    }

    public static void delete(int id) {
        String sql = String.format("DELETE FROM anime_store.producer WHERE id=%d;", id);
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {
            int execute = stmt.executeUpdate(sql);
            log.info("Deleted producer whith id '{}' in the database rows affected {}", id, execute);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer with id  '{}'", id, e);
        }
    }

    public static void updateName(Producer producer) {
        String sql = String.format("UPDATE anime_store.producer SET name='%s' WHERE id=%d;", producer.getName(), producer.getId());
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {

            int i = stmt.executeUpdate(sql);
            log.info("Upadated procuder name with id '{}'", producer.getId());

        } catch (SQLException e) {
            log.error("Error to trying updated producer name with id '{}'", producer.getId());
        }
    }

    public static List<Producer> findAll() {
        log.info("Finding all producers");
        return findByName("");
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding producers by name");
        String sql = "SELECT * FROM anime_store.producer WHERE name like '%%%s%%'"
                .formatted(name);
        List<Producer> producerList = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producerList.add(producer);
            }
            log.info("SELECTED ALL producer from  DATA_BASE ");
            return producerList;

        } catch (SQLException e) {
            log.error("Error while to trying to find all data from database");
        }
        return producerList;
    }

    public static void showProducerMetaData() {
        log.info("Showing Producer MetaData");
        String sql = "SELECT * FROM anime_store.producer";

        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            log.info("Columns count: '{}'", columnCount);

            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name '{}'", metaData.getTableName(i));
                log.info("Column name '{}'", metaData.getColumnName(i));
                log.info("Column size '{}'", metaData.getColumnDisplaySize(i));
                log.info("Column type '{}'", metaData.getColumnTypeName(i));
            }
        } catch (SQLException e) {
            log.error("Error while to trying to show  Producer Meta Data");
        }

    }

    public static void showDriverMetaData() {
        log.info("Showing Driver MetaData");
        try (Connection connection = ConnectionFactory.getConnection();) {
            DatabaseMetaData metaData = connection.getMetaData();
            if(metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                log.info("Supports TYPE_FORWARD_ONLY");
                if(metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)){
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }
            if(metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if(metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }
            if(metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if(metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.error("Error while to trying to show  Producer Meta Data");
        }

    }

    public static void showTypeScrollWorking() {
        log.info("Finding producers by name");
        String sql = "SELECT * FROM anime_store.producer;";
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            log.info("Last row ? '{}'", rs.last());
            log.info("Row number ? '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("First row ? '{}'", rs.first());
            log.info("Row number ? '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row absolute ? '{}'", rs.absolute(2));
            log.info("Row number ? '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row relative ? '{}'", rs.relative(-1)); //volta uma de onde esta o cursor
            log.info("Row number ? '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

//            tem o previous, mas precisa mover o cursor isAfterLast, para saber se vai pegar todos

        } catch (SQLException e) {
            log.error("Error while to trying to find all data from database");
        }

    }

}
