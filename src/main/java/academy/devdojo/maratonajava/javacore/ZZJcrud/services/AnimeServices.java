package academy.devdojo.maratonajava.javacore.ZZJcrud.services;

import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.AnimeRepository;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;

import java.util.Optional;
import java.util.Scanner;

@Log4j2
public class AnimeServices {
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
        AnimeRepository.findByName(s)
                .forEach(p -> System.out.printf("[%d] - %s, %s%n", p.getId(), p.getName(), p.getProducer().getName()));
    }

    private static void findAll() {
        String s = "";
        AnimeRepository.findByName(s)
                .forEach(p -> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));

    }

    private static void delete() {
        findAll();
        System.out.println("Type one of the id's to delete ");
        int i = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            AnimeRepository.delete(i);
        }
    }

    private static void save() {
        //name,episodes,producer_id

        System.out.println("Type the name name of the Anime");
        String name = SCANNER.nextLine();

        System.out.println("Type the number of episodes: ");
        int episodes = Integer.parseInt(SCANNER.nextLine());

        ProducerServices.findAll();
        System.out.println("Type the number of the producer: ");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());

        Anime anime = Anime.builder().name(name).episodes(episodes).producer(Producer.builder().id(producerId).build()).build();
        AnimeRepository.saveProducer(anime);
    }

    private static void update() {
        System.out.printf("Type the id of Anime to update: ");
        Optional<Anime> producerOptional = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (producerOptional.isEmpty()) {
            System.out.println("Anime not found");
            return;
        }
        Anime animeFromDb = producerOptional.get();
        System.out.println("Anime found" + animeFromDb);
        System.out.printf("Type the new name or enter to keep the same: ");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromDb.getName() : name;

        System.out.println("Type the number of episodes");
        int episodes = Integer.parseInt(SCANNER.nextLine());

        Anime newProducer = Anime.builder().id(animeFromDb.getId()).name(name).episodes(episodes).producer(animeFromDb.getProducer()).build();
        AnimeRepository.update(newProducer);

    }
}
