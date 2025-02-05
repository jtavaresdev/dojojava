package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {

    public static void save(Producer produce){
        ProducerRepository.save(produce);
    }
    public static void delete(int id){
        if (id < 0){
            throw new IllegalArgumentException("Invalid value for id");
        }
        ProducerRepository.delete(id);
    }

    public static void updateName(Producer producer){
        if (producer.getId() < 0){
            throw new IllegalArgumentException("Invalid value for id");
        }
        ProducerRepository.updateName(producer);
    }
    public static List<Producer> findAll(){
        return ProducerRepository.findAll();
    }
    public static List<Producer> findByName(String name){
        return ProducerRepository.findByName(name);
    }
    public static void showProducerMetaData(){
        ProducerRepository.showProducerMetaData();
    }
    public static void showDriverMetaData(){
        ProducerRepository.showDriverMetaData();
    }
    public static void showTypeScrollWorking(){
        ProducerRepository.showTypeScrollWorking();
    }

}
