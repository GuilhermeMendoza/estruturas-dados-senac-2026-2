package com.example;

public class RegrasVetores {
   public RegrasVetores() {
   }

   public void regraDoTipoUnico() {
      System.out.println("\n--- Regra 1: um vetor só aceita um tipo ---");
      int[] idades = new int[]{15, 20, 42};
      System.out.println("Vetor válido (só int): idades[0] = " + idades[0]);
      System.out.println("Tentar misturar tipos no mesmo vetor primitivo gera erro de compilação (veja o comentário no código-fonte).");
   }

   public void excecaoAparenteComObject() {
      System.out.println("\n--- Vetor de Object: mistura aparente, mas com custo ---");
      Object[] misturado = new Object[]{10, "vinte", 3.14, true};

      for(int i = 0; i < misturado.length; ++i) {
         System.out.println("misturado[" + i + "] = " + String.valueOf(misturado[i]) + " (tipo real: " + misturado[i].getClass().getSimpleName() + ")");
      }

   }

   public void regraDoTamanhoFixo() {
      System.out.println("\n--- Regra 2: o tamanho do vetor é fixo ---");
      int[] numeros = new int[3];
      System.out.println("Vetor criado com tamanho fixo: " + numeros.length);
      int[] numerosMaior = new int[4];

      for(int i = 0; i < numeros.length; ++i) {
         numerosMaior[i] = numeros[i];
      }

      numerosMaior[3] = 40;
      System.out.println("Vetor \"antigo\" continua com tamanho: " + numeros.length);
      System.out.println("Vetor NOVO, criado por cópia, tem tamanho: " + numerosMaior.length);
   }

   public void demonstrarTodos() {
      this.regraDoTipoUnico();
      this.excecaoAparenteComObject();
      this.regraDoTamanhoFixo();
   }
}
