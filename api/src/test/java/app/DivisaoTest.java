package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DivisaoTest {

    @Test
    public void TesteDivisao () {

        Divisao s = new Divisao();
        double resultado = s.calcularDivisao(4, 2);
        assertEquals(2, resultado);
    }
    
    

    @Test
    public void Teste() {

        Divisao s = new Divisao();
        double resultado = s.calcularDivisao(10, 5);
        assertEquals(2, resultado);
    }
    

}