package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
//        List<Producer> producerList = ProducerServiceRowSet.findByNameJdbcRowSet("Mappa");
//        log.info("Producer found is '{}' ",producerList);
        Producer producer = Producer.builder().id(12).name("White Fox").build();
        ProducerServiceRowSet.updateCachedRowSet(producer);
//        log.info("----------------------------");
//        List<Producer> byNameJdbcRowSet = ProducerServiceRowSet.findByNameJdbcRowSet("");
//        log.info(byNameJdbcRowSet);
//        ProducerServiceRowSet.updateCachedRowSet(producer);
    }
}
