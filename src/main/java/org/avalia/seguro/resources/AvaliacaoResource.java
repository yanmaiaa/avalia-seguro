package org.avalia.seguro.resources;

import org.avalia.seguro.model.ReviewRequest;
import org.avalia.seguro.model.ReviewResponse;
import org.avalia.seguro.service.ReviewService;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;

@Path("/api/avalia-seguro/review")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RequiredArgsConstructor
public class AvaliacaoResource {
  private final ReviewService reviewService;
  
   @POST
   @Operation(summary = "Analisa a confiabilidade de uma avaliação de produtos e/ou serviços")
   @APIResponse(
      responseCode = "200", description = "Resultado da análise da avaliação",
      content = @Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = ReviewResponse.class))
    )
    public Response analisarReview(@RequestBody(description = "Texto da avaliação", required = true)  ReviewRequest request) {
      var resultado = reviewService.analisarTexto(request.getTexto());
      return Response.ok(resultado).build();
    }
}
