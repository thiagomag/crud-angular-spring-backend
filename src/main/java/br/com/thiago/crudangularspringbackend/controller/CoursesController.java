package br.com.thiago.crudangularspringbackend.controller;

import br.com.thiago.crudangularspringbackend.entity.Courses;
import br.com.thiago.crudangularspringbackend.service.CoursesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/courses")
public class CoursesController {

    private final CoursesService coursesService;

    @GetMapping
    public @ResponseBody List<Courses> findAll() {
        return coursesService.findAll();
    }

    @PostMapping
    public Courses save(@RequestBody Courses courses) {
        return coursesService.save(courses);
    }
}