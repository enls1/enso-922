package app;

import io.jooby.annotations.*;

@Path("/multi/{op1}/{op2}")
public class Multiplicacao{

    @GET
    public double calcularMultiplicacao(@PathParam double op1 , @PathParam double op2){
           double resultado = op1*op2;
           return resultado;
    }
}