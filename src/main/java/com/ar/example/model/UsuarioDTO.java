package com.ar.example.model;

import lombok.*;

@Data
@Builder
public class UsuarioDTO {
    private String nombre;
    private String apellido;
    private String dni;
}
