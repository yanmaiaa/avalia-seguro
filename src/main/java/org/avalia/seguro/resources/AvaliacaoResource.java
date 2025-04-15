package org.avalia.seguro.resources;

import org.avalia.seguro.model.ReviewRequest;
import org.avalia.seguro.model.ReviewResponse;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;

@Path("/avalia-seguro/avaliacoes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RequiredArgsConstructor
public class AvaliacaoResource {

   @POST
   @Operation(summary = "Analisa a confiabilidade de uma avaliação de produtos e/ou serviços")
   @APIResponse(
      responseCode = "200", description = "Resultado da análise da avaliação",
      content = @Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = ReviewResponse.class))
    )
    public Response analisarReview(ReviewRequest request) {
      ReviewResponse resultado = new ReviewResponse();
        return Response.ok(resultado).build();
    }
}
