package com.example.msmatricula.service;


import com.example.msmatricula.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    List<Curso> lista();
    Curso guardar(Curso curso);
    Optional<Curso> buscarPorId(Integer id);
    Curso actualizar(Curso curso);
    void eleminar(Integer id);
}
