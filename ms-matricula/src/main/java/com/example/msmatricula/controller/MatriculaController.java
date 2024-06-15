package com.example.msmatricula.controller;


import com.example.msmatricula.entity.Matricula;
import com.example.msmatricula.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaService matriculaService;

    @GetMapping
    ResponseEntity<List<Matricula>> lista(){
        return ResponseEntity.ok(matriculaService.lista());
    }
    @PostMapping
    ResponseEntity<Matricula> guardar(@RequestBody Matricula matricula){
        return ResponseEntity.ok(matriculaService.guardar((matricula)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Matricula> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(matriculaService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Matricula> actualizar(@RequestBody Matricula matricula){
        return ResponseEntity.ok(matriculaService.actualizar((matricula)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Matricula>> eleminar(@PathVariable(required = true) Integer id){
        matriculaService.eleminar(id);
        return ResponseEntity.ok(matriculaService.lista());

    }
}
