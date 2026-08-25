package com.example;

public class Main {
    public static void main(String[] args){ 
        
        AnaliseComplexidade analise = new AnaliseComplexidade();
        int[] numeros = {10, 12, 14, 16, 20};
        
        analise.tempoConstante(numeros);
        analise.tempoLogaritmico(AnaliseComplexidade.getN());
        analise.tempoLinear(5);
        analise.tempoQuadratico(3);
    }
}

