package com.tu_proyecto.usuarios.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;

    private String codigo;
    private String nombres;
    private String apellidos;
    private String mail;
    private Date fecha_nacimiento;
    private String contrasena;
    private String estado;
    private Date fecha_ultima_conexion;
    private int usuario_creacion;
    private Date fecha_creacion;
    private int usuario_modificacion;
    private Date fecha_modificacion;

    // Getters and Setters
}
