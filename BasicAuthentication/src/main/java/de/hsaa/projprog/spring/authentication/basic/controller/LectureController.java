package de.hsaa.projprog.spring.authentication.basic.controller;

import de.hsaa.projprog.spring.authentication.basic.model.Lecture;
import de.hsaa.projprog.spring.authentication.basic.service.LectureService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("/private/v1/lecture")
public class LectureController {
    final private LectureService lectureService;

    public LectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @GetMapping()
    public ResponseEntity<Collection<Lecture>> getAllLecture() {
        return new ResponseEntity<>(lectureService.getAllLectures(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Lecture> getLectureByID(@PathVariable String id) {
        Optional<Lecture> lecture = this.lectureService.getLectureById(id);
        if (lecture.isPresent()) {
            return new ResponseEntity<>(lecture.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
