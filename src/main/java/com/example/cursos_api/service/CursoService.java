package com.example.cursos_api.service;

import com.example.cursos_api.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    Curso registrar(Curso curso);
    List<Curso> listar();
    Optional<Curso> buscarPorId(Long id);
    void eliminar(Long id);
}
