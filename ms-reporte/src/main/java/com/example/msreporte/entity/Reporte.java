package com.example.msreporte.entity;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipo;

    // Relación con Destinatario (Uno a Muchos)
    // @OneToMany(mappedBy = "mensaje", cascade = CascadeType.ALL)
    // private List<Destinatario> destinatario;

    // Relación con Notificación (Uno a Uno)
 

}