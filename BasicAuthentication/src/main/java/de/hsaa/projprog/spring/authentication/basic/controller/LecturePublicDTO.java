package de.hsaa.projprog.spring.authentication.basic.controller;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class LecturePublicDTO {

    private UUID id;
    private String lectureName;
}
