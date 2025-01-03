package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> byTitle = MangaRepository.findBy((s) -> s.getTitle().equals("Boku no Hero"));
        byTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        Optional<Manga> byId = MangaRepository.findBy(s -> s.getId().equals(2));
        byId.orElseThrow(IllegalArgumentException::new);
        System.out.println(byTitle);
        System.out.println(byId);
    }
}
