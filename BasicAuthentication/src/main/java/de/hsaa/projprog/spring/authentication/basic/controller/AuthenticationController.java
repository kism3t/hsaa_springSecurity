package de.hsaa.projprog.spring.authentication.basic.controller;

import de.hsaa.projprog.spring.authentication.basic.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/public/v1")
public class AuthenticationController {

    @GetMapping(path = "/basicauth")
    public ResponseEntity<User> login(Authentication authentication) {

        return new ResponseEntity<>(
                User
                .builder()
                        .name(authentication.getName())
                        .role(authentication.getAuthorities().toString())
                .build(),
                HttpStatus.OK);
    }
}
