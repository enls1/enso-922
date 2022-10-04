package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplicacaoTest {

    @Test
    public void TesteMultiplicacao () {

        Multiplicacao m = new Multiplicacao();
        double resultado = m.calcularMultiplicacao(4, 3);
        assertEquals(12, resultado);
    }
    

    @Test
    public void TesteDecimal() {

        Multiplicacao m = new Multiplicacao();
        double resultado = m.calcularMultiplicacao(4, 6);
        assertEquals(24, resultado);
    }
    

}