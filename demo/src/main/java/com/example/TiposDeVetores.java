package com.example;

public class TiposDeVetores {
   public TiposDeVetores() {
   }

   public void vetorDeInteiros() {
      System.out.println("\n--- Vetor de int ---");
      int[] idades = new int[3];
      System.out.println("Antes de preencher: idades[0] = " + idades[0]);
      idades[0] = 15;
      idades[1] = 20;
      idades[2] = 42;

      for(int i = 0; i < idades.length; ++i) {
         System.out.println("idades[" + i + "] = " + idades[i]);
      }

   }

   public void vetorDeDecimais() {
      System.out.println("\n--- Vetor de double ---");
      double[] precos = new double[]{9.9, 19.99, (double)100.0F};

      for(int i = 0; i < precos.length; ++i) {
         System.out.println("precos[" + i + "] = " + precos[i]);
      }

   }

   public void vetorDeBooleanos() {
      System.out.println("\n--- Vetor de boolean ---");
      boolean[] presencas = new boolean[4];
      System.out.println("Antes de preencher: presencas[0] = " + presencas[0]);
      presencas[0] = true;
      presencas[1] = false;
      presencas[2] = true;
      presencas[3] = true;

      for(int i = 0; i < presencas.length; ++i) {
         System.out.println("presencas[" + i + "] = " + presencas[i]);
      }

   }

   public void vetorDeCaracteres() {
      System.out.println("\n--- Vetor de char ---");
      char[] letras = new char[]{'j', 'a', 'v', 'a'};

      for(int i = 0; i < letras.length; ++i) {
         System.out.println("letras[" + i + "] = " + letras[i]);
      }

   }

   public void vetorDeTextos() {
      System.out.println("\n--- Vetor de String ---");
      String[] nomesVazios = new String[2];
      System.out.println("Antes de preencher: nomesVazios[0] = " + nomesVazios[0]);
      String[] nomes = new String[]{"Ana", "Bruno", "Carla"};

      for(int i = 0; i < nomes.length; ++i) {
         System.out.println("nomes[" + i + "] = " + nomes[i]);
      }

   }

   public void demonstrarTodos() {
      this.vetorDeInteiros();
      this.vetorDeDecimais();
      this.vetorDeBooleanos();
      this.vetorDeCaracteres();
      this.vetorDeTextos();
   }
}
