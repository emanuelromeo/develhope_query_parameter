package com.develhope.query_parameter.controller;

import com.develhope.query_parameter.service.V1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class V1Controller {

    @Autowired
    private V1Service v1Service;

    @GetMapping("/ciao")
    public ResponseEntity<String> saluta(
                @RequestParam String nome,
                @RequestParam String provincia
    ) {
            String saluto = v1Service.saluta(nome, provincia);
            return ResponseEntity.ok(saluto);
    }
}
