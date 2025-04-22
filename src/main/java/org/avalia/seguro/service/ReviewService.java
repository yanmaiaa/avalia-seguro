package org.avalia.seguro.service;
import org.avalia.seguro.model.TextPatterns;
import org.avalia.seguro.model.ReviewResponse;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@ApplicationScoped
public class ReviewService {

  public ReviewResponse analisarTexto(String texto) {
        //Lógica simulada para futuramente chamarmos o microserviço em Python
        int nota = 80;
        String justificativa = "Texto parece confiável. Linguagem natural e coerente.";

        if (texto.length() < 10) {
            nota = 30;
            justificativa = "Texto muito curto. Possivelmente genérico ou falso.";
        } 
        if (TextPatterns.PADROES_SUSPEITOS.contains(texto)) {
            nota = 20;
            justificativa = "Texto com padrão repetitivo. Suspeita de automação.";
        }

        var response = new ReviewResponse();
        response.setNota(nota);
        response.setJustificativa(justificativa);
        
        return response;
    }

}
