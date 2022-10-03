package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisaoTest {

    @Test
    public void verificarCasoBase(){

        Divisao divisao = new Divisao();
        double resultado = divisao.calcula("4","2");
        assertEquals(2.0, resultado);

    }

    @Test
    public void verificarDivisaoDouble(){

        Divisao divisao = new Divisao();
        double resultado = divisao.calcula("7", "2");
        assertEquals(3.5, resultado);

    }
    
}