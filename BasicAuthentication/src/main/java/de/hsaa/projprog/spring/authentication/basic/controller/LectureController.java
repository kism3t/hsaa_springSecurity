package de.hsaa.projprog.spring.authentication.basic.controller;

import de.hsaa.projprog.spring.authentication.basic.model.Lecture;
import de.hsaa.projprog.spring.authentication.basic.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/private/v1/lecture")
public class LectureController {
    final private LectureService lectureService;

    public LectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @GetMapping()
    public ResponseEntity<Collection<Lecture>> getAllLecture() {
        return new ResponseEntity(lectureService.getAllLectures(), HttpStatus.OK);
    }
}
