package com.develhope.query_parameter.service;

import org.springframework.stereotype.Service;

@Service
public class V1Service {

    public String saluta(String nome, String provincia) {
        StringBuilder stringBuilder = new StringBuilder("Ciao ");
        stringBuilder.append(nome);
        stringBuilder.append(", com'è il tempo in ");
        stringBuilder.append(provincia);
        stringBuilder.append("?");

        return stringBuilder.toString();
    }
}
