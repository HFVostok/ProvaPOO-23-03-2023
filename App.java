package ProvaExercios;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner sc1 = new Scanner(System.in);

    System.out.println("Escolha Entre as Opeções de 1 á 6 digitando o número:");
    System.out.println("1-Soma:");
    System.out.println("2-Subtração:");
    System.out.println("3-Multiplicação:");
    System.out.println("4-Divisão");
    System.out.println("5-Seletora de Times");
    System.out.println("6-Mercado do FreeFruit do Seu Madruga");

    int opcaoMenu = sc1.nextInt();

    
    if (opcaoMenu == 1) {
      Exercicios obj = new Exercicios();
      obj.soma();
    } else if (opcaoMenu == 2) {
      Exercicios obj = new Exercicios();
      obj.subtracao();
    } else if (opcaoMenu == 3) {
      Exercicios obj = new Exercicios();
      obj.multiplicacao();
    } else if (opcaoMenu == 4) {
      Exercicios obj = new Exercicios();
      obj.divisao();
    } else if (opcaoMenu == 5) {
      Exercicios obj = new Exercicios();
      obj.seletorTimes();
    } else if (opcaoMenu == 6) {
      Exercicios obj = new Exercicios();
      obj.freeFruit();
    } else {
      System.out.println("Erro Digite Novamente");

    }
    sc1.close();
  }
}
