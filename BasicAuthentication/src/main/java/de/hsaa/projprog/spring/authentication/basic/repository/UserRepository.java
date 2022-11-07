package de.hsaa.projprog.spring.authentication.basic.repository;

import de.hsaa.projprog.spring.authentication.basic.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
