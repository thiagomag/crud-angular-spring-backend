package br.com.thiago.crudangularspringbackend.repository;

import br.com.thiago.crudangularspringbackend.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long> {
}
