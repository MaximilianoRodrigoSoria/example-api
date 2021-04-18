package com.ar.example.controller;

import com.ar.example.model.UsuarioDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class ExampleController {

    @GetMapping("/health")
    public String health(){
        log.info("Estoy vivo!!!");
        return "Estoy vivo!!!";
    }


    @GetMapping("/usuario")
    public UsuarioDTO getUsuario() {
        UsuarioDTO usuario = UsuarioDTO
                .builder()
                .apellido("Soria")
                .nombre("Maxi")
                .dni("465465")
                .build();
        log.info(usuario.toString());
        return usuario;
    }

}
