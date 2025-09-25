package com.example.cursos_api.repository;

import com.example.cursos_api.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository <Curso, Long> {
}
