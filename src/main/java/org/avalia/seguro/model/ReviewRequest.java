package org.avalia.seguro.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class ReviewRequest {

  @NotEmpty
  @Schema(examples = {"Este produto X é muito maravilhoso..."}, required = true)
  public String texto;

}
