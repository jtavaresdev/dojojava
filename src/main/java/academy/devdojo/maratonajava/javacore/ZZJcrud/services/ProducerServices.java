package academy.devdojo.maratonajava.javacore.ZZJcrud.services;

import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;

import java.util.Optional;
import java.util.Scanner;

@Log4j2
public class ProducerServices {
    public static Scanner SCANNER = new Scanner(System.in);

    public static void buildMenu(int op) {

        switch (op) {
            case 1 -> find();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void find() {
        System.out.print("Type the name ou empty to all: ");
        String s = SCANNER.nextLine();
        ProducerRepository.findByName(s)
                .forEach(p -> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));
    }

    protected static void findAll() {
        String s = "";
        ProducerRepository.findByName(s)
                .forEach(p -> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));

    }

    private static void delete() {
        findAll();
        System.out.println("Type one of the id's to delete ");
        int i = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            ProducerRepository.delete(i);
        }
    }

    private static void save() {
        System.out.println("Type the name name of the producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.saveProducer(producer);
    }

    private static void update() {
        System.out.printf("Type the id of producer to update: ");
        Optional<Producer> producerOptional = ProducerRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (producerOptional.isEmpty()) {
            System.out.println("Producer not found");
            return;
        }
        Producer producerFromDb = producerOptional.get();
        System.out.println("Producer found" + producerFromDb);
        System.out.printf("Type the new name or enter to keep the same: ");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? producerFromDb.getName() : name;
        Producer newProducer = Producer.builder().id(producerFromDb.getId()).name(name).build();
        ProducerRepository.update(newProducer);

    }
}
