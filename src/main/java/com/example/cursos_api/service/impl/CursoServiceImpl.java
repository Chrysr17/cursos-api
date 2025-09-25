package com.example.cursos_api.service.impl;

import com.example.cursos_api.entity.Curso;
import com.example.cursos_api.repository.CursoRepository;
import com.example.cursos_api.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Curso registrar(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

    @Override
    public Optional<Curso> buscarPorId(Long id) {
        return cursoRepository.findById(id);
    }

    @Override
    public void eliminar(Long id) {
        cursoRepository.deleteById(id);
    }
}
