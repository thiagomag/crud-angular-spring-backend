package br.com.thiago.crudangularspringbackend.service;

import br.com.thiago.crudangularspringbackend.entity.Courses;
import br.com.thiago.crudangularspringbackend.repository.CoursesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoursesService {

    private final CoursesRepository coursesRepository;

    public List<Courses> findAll() {
        return coursesRepository.findAll();
    }

    public Courses save(Courses courses) {
        return coursesRepository.save(courses);
    }
}