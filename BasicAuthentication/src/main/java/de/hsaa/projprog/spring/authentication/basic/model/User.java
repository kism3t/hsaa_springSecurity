package de.hsaa.projprog.spring.authentication.basic.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String name;
    private String role;
}
