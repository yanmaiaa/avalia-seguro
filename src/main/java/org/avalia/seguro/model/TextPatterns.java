package org.avalia.seguro.model;

import java.util.List;

public class TextPatterns {

  private TextPatterns() {}

  public static final String REPETICAO_OTIMO = "ótimo ótimo ótimo";
  public static final String REPETICAO_EXCELENTE = "excelente excelente excelente";
  public static final String REPETICAO_RECOMENDO = "recomendo recomendo recomendo";

  public static final List<String> PADROES_SUSPEITOS = List.of(
    REPETICAO_OTIMO,
    REPETICAO_EXCELENTE,
    REPETICAO_RECOMENDO
  );

}
