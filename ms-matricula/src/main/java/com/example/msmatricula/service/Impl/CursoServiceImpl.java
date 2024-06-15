package com.example.msmatricula.service.Impl;


import com.example.msmatricula.entity.Curso;
import com.example.msmatricula.repository.CursoRepository;
import com.example.msmatricula.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoRepository cursoRepository;


    @Override
    public List<Curso> lista() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso guardar(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Optional<Curso> buscarPorId(Integer id) {
        return cursoRepository.findById(id);
    }

    @Override
    public Curso actualizar(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public void eleminar(Integer id) {
        cursoRepository.deleteById(id);

    }
}
