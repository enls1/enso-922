package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SomaTest {

    @Test
    public void TesteSoma () {

        Soma s = new Soma();
        double resultado = s.calcularSoma(4, 4);
        assertEquals(8, resultado);
    }
    

    @Test
    public void TesteDecimal() {

        Soma s = new Soma();
        double resultado = s.calcularSoma(4, 4.5);
        assertEquals(8.5, resultado);
    }
    

}