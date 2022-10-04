package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubtracaoTest {

    @Test
    public void TesteSubtracao () {

        Subtracao s = new Subtracao();
        double resultado = s.calcularSubtracao(9, 6);
        assertEquals(3, resultado);
    }
    

    @Test
    public void TesteDecimal() {

        Subtracao s = new Subtracao();
        double resultado = s.calcularSubtracao(6, 4.5);
        assertEquals(1.5, resultado);
    }
    

}