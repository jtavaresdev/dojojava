package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = String.format("INSERT INTO anime_store.producer (name) VALUES ('%s');", producer.getName());
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {
            int execute = stmt.executeUpdate(sql);
            System.out.println("RowlsAffected: "+execute);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
