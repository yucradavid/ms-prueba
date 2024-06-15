package com.example.msreporte.service.Impl;

import java.util.List;
import java.util.Optional;

import com.example.msreporte.entity.Reporte;
import com.example.msreporte.repository.ReporteRepository;
import com.example.msreporte.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ReporteServiceImpl implements ReporteService {
    @Autowired
    private ReporteRepository reporteRepository;


    @Override
    public List<Reporte> lista() {
        return reporteRepository.findAll();
    }

    @Override
    public Reporte guardar(Reporte reporte) {
        return reporteRepository.save(reporte);
    }

    @Override
    public Optional<Reporte> buscarPorId(Integer id) {
        return reporteRepository.findById(id);
    }

    @Override
    public Reporte actualizar(Reporte reporte) {
        return reporteRepository.save(reporte);
    }

    @Override
    public void eleminar(Integer id) {
        reporteRepository.deleteById(id);

    }
}
