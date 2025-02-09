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
        try (Connection connection = ConnectionFactory.getConnection(); Statement stmt = connection.createStatement()) {
            int execute = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database rows affected {}", producer.getName(), execute);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }
    }

    public static void saveTransaction(List<Producer> producer) {
        try (Connection connection = ConnectionFactory.getConnection()) {
            connection.setAutoCommit(false);
            preparedStatementSaveTransaction(connection, producer);
            connection.commit();
            connection.setAutoCommit(true);

        } catch (SQLException e) {
            log.error("Error to trying save producers '{}'", producer, e);
        }
    }

    public static void preparedStatementSaveTransaction(Connection connection, List<Producer> producer) throws SQLException {
        String sql = "INSERT INTO anime_store.producer (name) VALUES ( ? );";
        boolean shouldRollBack = false;
        for (Producer p : producer) {
            try (PreparedStatement ps = connection.prepareStatement(sql);) {
                log.info("Saving producer '{}'", p.getName());
                ps.setString(1, p.getName());
                ps.execute();
            } catch (SQLException e) {
                e.printStackTrace();
                shouldRollBack = true;
            }
        }
        if (shouldRollBack) {
            log.warn("Rollback data base");
            connection.rollback();
        }

    }

    public static void delete(int id) {
        String sql = String.format("DELETE FROM anime_store.producer WHERE id=%d;", id);
        try (Connection connection = ConnectionFactory.getConnection(); Statement stmt = connection.createStatement()) {
            int execute = stmt.executeUpdate(sql);
            log.info("Deleted producer whith id '{}' in the database rows affected {}", id, execute);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer with id  '{}'", id, e);
        }
    }

    public static void updatePreparedStatement(Producer producer) {
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementUpdate(connection, producer)) {

            int i = ps.executeUpdate();
            log.info("Upadated procuder '{}', rows affected '{}'", producer.getId(), i);

        } catch (SQLException e) {
            log.error("Error to trying updated producer name with id '{}'", producer.getId());
        }
    }

    public static PreparedStatement preparedStatementUpdate(Connection connection, Producer producer) throws SQLException {
        String sql = String.format("UPDATE anime_store.producer SET name=? WHERE id=?;", producer.getName(), producer.getId());
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }

    public static void update(Producer producer) {
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
        String sql = "SELECT * FROM anime_store.producer WHERE name like '%%%s%%'".formatted(name);
        List<Producer> producerList = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection(); Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
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

    public static List<Producer> findByNamePreparedStatement(String name) {
        log.info("Finding producers by name");
        List<Producer> producerList = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindByName(connection, name);// Abstrair para um metodo fora, para utilizar o autocloseable
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

    public static PreparedStatement preparedStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE name like ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static void showProducerMetaData() {
        log.info("Showing Producer MetaData");
        String sql = "SELECT * FROM anime_store.producer";

        try (Connection connection = ConnectionFactory.getConnection(); Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
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
            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
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

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        log.info("Finding producers by name");
        String sql = "SELECT * FROM anime_store.producer WHERE name like '%%%s%%'".formatted(name);
        List<Producer> producerList = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow(); // Atualizar a Row
                Producer producer = Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
                producerList.add(producer);
            }
            log.info("FIND BY NAME producer from  DATA_BASE ");
            return producerList;

        } catch (SQLException e) {
            log.error("Error while to trying to find all data from database");
        }
        return producerList;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        log.info("Finding producers by name");
        String sql = "SELECT * FROM anime_store.producer WHERE name like '%%%s%%'".formatted(name);
        List<Producer> producerList = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return findByName(name);
            }
            rs.moveToInsertRow();
            rs.updateString("name", name);
            rs.insertRow();
            rs.beforeFirst();
            rs.next();
            producerList.add(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("FIND BY NAME OR INSERT WHEN NOT FOUND producer from  DATA_BASE ");
            return producerList;

        } catch (SQLException e) {
            log.error("Error while to trying to find all data from database");
        }
        return producerList;
    }

    public static void findByNameAndDelete(String name) {
        log.info("Deleting producers by name");
        String sql = "SELECT * FROM anime_store.producer WHERE name like '%%%s%%'".formatted(name);
        List<Producer> producerList = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                log.info("Deleting '{}'", rs.getString("name"));
                rs.deleteRow();
            }

            log.info("Deleted producer ");

        } catch (SQLException e) {
            log.error("Error while to trying to find all data from database");
        }
    }


}
