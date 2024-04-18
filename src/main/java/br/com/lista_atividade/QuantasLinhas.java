package br.com.lista_atividade;

import java.io.*;
import java.util.Scanner;

class QuantasLinhas {
  public static void main(String[] args) {

    int count = 0;

    try {
      File file = new File("meuarquivo.txt");

      Scanner sc = new Scanner(file);

      while(sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }
      System.out.println("O numero total de linhas e: " + count);

      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}