package de.hsaa.projprog.spring.authentication.basic.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class Lecture {

    private UUID id;
    private String lectureName;
    private List<String> students;

}
