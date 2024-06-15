package com.example.msmatricula.repository;


import com.example.msmatricula.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
    
}
