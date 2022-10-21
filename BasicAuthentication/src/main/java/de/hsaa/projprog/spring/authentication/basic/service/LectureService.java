package de.hsaa.projprog.spring.authentication.basic.service;

import de.hsaa.projprog.spring.authentication.basic.model.Lecture;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class LectureService {
    Map<UUID, Lecture> lectureMap = new HashMap<>();

    {
        Lecture lecture1 = Lecture
                .builder()
                .id(UUID.randomUUID())
                .lectureName("Projektseminar Programmierung")
                .students(List.of(
                        "Nico Bay",
                        "Philipp Beisswanger",
                        "Mahir Berkcan",
                        "Marcus Bilo",
                        "Tim Dauser",
                        "Niklas Dimoski",
                        "Tobias Gentner",
                        "Alexander Ginkel",
                        "Tim Grunwald",
                        "Sara Haileselassie",
                        "Jannic Hofmann",
                        "Hendrik Illenberger",
                        "Robin Kirrmann",
                        "Fabian Klaerer",
                        "Moritz Knoellv",
                        "Ferhat Nazlioglu",
                        "Timon Neitzel",
                        "Kim Neuhaeusler",
                        "Sinem Oezkan",
                        "Muhammed Oeztuerk",
                        "Isabel Ostermann",
                        "Rene Priel",
                        "Jonas Roessel",
                        "Christoph Schuerger",
                        "Jacob Schulze",
                        "Marius Traub",
                        "Furkan Vural",
                        "Kai Wannenwetsch",
                        "Jonas Werner",
                        "Robin Wiedemann",
                        "Nico Wittek",
                        "Selim Yilmaz",
                        "Toni Zubac"
                ))
                .build();
        lectureMap.put(lecture1.getId(), lecture1);
    }

    public Collection<Lecture> getAllLectures() {
        return lectureMap.values();
    }
}
