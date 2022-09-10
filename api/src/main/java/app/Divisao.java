package app;
import io.jooby.annotations.*;

@Path("/Divi/{op1}/{op2}")

public class Divisao{
    @GET
    public double calcularDivisao(@PathParam double op1, @PathParam double op2){
        double resultado=op1/op2;
        return resultado;
        
        
    }
}
