package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.sql.SQLException;
import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
//        Producer producer = Producer.builder().name("A-1 Pictures").build();
//        ProducerService.save(producer);
        Producer producer = Producer.builder().id(12).name("White Fox").build();
        ProducerService.updatePreparedStatement(producer);
//        List<Producer> all = ProducerService.findAll();
//        log.info(all);
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        log.info(ProducerService.findByNameAndUpdateToUpperCase("White"));
//        log.info(ProducerService.findByNameAndInsertWhenNotFound("Bones"));
//        ProducerService.findByNameAndDelete("Studio Ghibli");
//        List<Producer> bones = ProducerService.findByNamePreparedStatement("dio");
//        log.info("Producer '{}'", bones);
    }

}
