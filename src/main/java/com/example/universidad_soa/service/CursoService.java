package com.example.universidad_soa.service;

import com.example.universidad_soa.entity.Curso;

import java.util.List;

public interface CursoService {
    Curso registrar(Curso curso);
    List<Curso> listar();
    Curso buscarPorId(Long id);
    void eliminar(Long id);
}
