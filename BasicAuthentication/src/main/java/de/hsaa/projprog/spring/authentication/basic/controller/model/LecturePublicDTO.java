package de.hsaa.projprog.spring.authentication.basic.controller.model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class LecturePublicDTO {

    private String id;
    private String name;
}
