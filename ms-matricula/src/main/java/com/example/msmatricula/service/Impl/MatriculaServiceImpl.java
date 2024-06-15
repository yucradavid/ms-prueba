package com.example.msmatricula.service.Impl;


import com.example.msmatricula.dto.DocenteDto;
import com.example.msmatricula.entity.Curso;
import com.example.msmatricula.entity.Matricula;
import com.example.msmatricula.feign.DocentesFeign;
import com.example.msmatricula.feign.EstudiantesFeign;
import com.example.msmatricula.repository.MatriculaRepository;
import com.example.msmatricula.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaServiceImpl implements MatriculaService {
    @Autowired
    private MatriculaRepository matriculaRepository;
    @Autowired
    private EstudiantesFeign estudiantesFeign;

    @Autowired
    private DocentesFeign docentesFeign;
    @Override
    public List<Matricula> lista() {
        return matriculaRepository.findAll();
    }

    @Override
    public Matricula guardar(Matricula matricula) {

        return matriculaRepository.save(matricula);
    }

    @Override
    public Optional<Matricula> buscarPorId(Integer id) {
        return matriculaRepository.findById(id);
    }

    @Override
    public Matricula actualizar(Matricula matricula) {
        return matriculaRepository.save(matricula);
    }

    @Override
    public void eleminar(Integer id) {
        matriculaRepository.deleteById(id);

    }
}
