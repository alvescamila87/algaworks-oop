package com.algaworks;

public class Fibonacci {

    // F(n) = F(n - 1) + F(n - 2);
    // 0, 1, 1, 2, 3, 5, 8,...
    // Posição 0 = 0, Posição 1 = 1, Posição 2 = 1, Posição 3 = 2, etc...
    public long calcular(long posicao){
        if(posicao <= 1){
            return posicao;
        }
        return calcular(posicao - 1) + calcular(posicao - 2);
    }
}
