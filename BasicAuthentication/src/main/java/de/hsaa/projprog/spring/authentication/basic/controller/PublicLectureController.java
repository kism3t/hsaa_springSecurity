package de.hsaa.projprog.spring.authentication.basic.controller;

import de.hsaa.projprog.spring.authentication.basic.model.Lecture;
import de.hsaa.projprog.spring.authentication.basic.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/public/v1/lecture")
public class PublicLectureController {

    final private LectureService lectureService;

    public PublicLectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @GetMapping()
    public ResponseEntity<Collection<LecturePublicDTO>> getAllLecture() {

        Collection<Lecture> allLectures = lectureService.getAllLectures();
        List<LecturePublicDTO> returnList = allLectures
                .stream()
                .map(
                        l -> LecturePublicDTO
                                .builder()
                                .id(l.getId())
                                .lectureName(l.getLectureName())
                                .build()
                ).toList();
        return new ResponseEntity(returnList, HttpStatus.OK);
    }
}
