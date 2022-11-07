package de.hsaa.projprog.spring.authentication.basic.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "app_user")
public class UserEntity {

    @Id
    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    private String role;
}
