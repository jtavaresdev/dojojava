package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

import java.sql.SQLException;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) throws SQLException {
        Producer mhrap = Producer.ProducerBuilder.builder().name("MHRAP").build();
        ProducerRepository.save(mhrap);
    }
}
