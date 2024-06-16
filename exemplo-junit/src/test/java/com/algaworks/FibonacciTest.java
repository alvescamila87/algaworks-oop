package com.algaworks;

import static org.junit.Assert.assertEquals; // Import static
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

    // Transformar o objeto em instância
    private Fibonacci fibonacci;

    // Iniciar antes de cada teste
    @Before
    public void init(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void deve_retornar_fibonacci_posicao_1(){
        // 1. Cenário
        long posicao = 1L;
        //Fibonacci fibonacci = new Fibonacci();

        // 2. Ação
        long valor = fibonacci.calcular(posicao);

        // 3. Validação
        //Assert.assertEquals(1L, valor);
        assertEquals(1L, valor);
    }

    @Test
    public void deve_retornar_fibonacci_posicao_2(){
        long posicao = 2L;
        //Fibonacci fibonacci = new Fibonacci();

        long valor = fibonacci.calcular(posicao);

        //Assert.assertEquals(1L, valor);
        assertEquals(1L, valor);
    }

    @Test
    public void deve_retornar_fibonacci_posicao_0(){
        long posicao = 0L;
        //Fibonacci fibonacci = new Fibonacci();

        long valor = fibonacci.calcular(posicao);

        //Assert.assertEquals(0L, valor);
        assertEquals(0L, valor);
    }
}
