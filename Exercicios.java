package ProvaExercios;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void soma() {

        System.out.println("Digite o Primeiro Valor a Ser Somado");
        double val1 = sc.nextDouble();

        System.out.println("Digite o Segundo Valor a Ser Somado");
        double val2 = sc.nextDouble();

        double resultadoSoma = (val1 + val2);

        System.out.println("O Resultado da soma é: " + resultadoSoma);

    }

    public void subtracao() {

        System.out.println("Digite o Primeiro Valor a Ser Subtraido");
        double val1 = sc.nextDouble();

        System.out.println("Digite o Segundo Valor a Ser Subtraido");
        double val2 = sc.nextDouble();

        double resultadoSubtracao = (val1 - val2);

        System.out.println("O Resultado da subtração é: " + resultadoSubtracao);

    }

    public void multiplicacao() {

        System.out.println("Digite o Primeiro Valor a Ser Multiplicado:");
        double val1 = sc.nextDouble();

        System.out.println("Digite o Segundo Valor a Ser Multiplicado:");
        double val2 = sc.nextDouble();

        double resultadoMultiplicacao = (val1 * val2);

        System.out.println("O Resultado da Multiplicação é: " + resultadoMultiplicacao);
    }

    public void divisao() {
        System.out.println("Digite o Primeiro Valor a Ser Dividido");
        double val1 = sc.nextDouble();

        System.out.println("Digite o Segundo Valor a Ser Dividido");
        double val2 = sc.nextDouble();

        double resultadodivisao = (val1 / val2);

        System.out.println("O Resultado da Divisão é: " + resultadodivisao);
    }

    // =============================================================================================

    public void seletorTimes() {
        System.out.println("Digite o numero de Matricula do Aluno de 1 a 1001:");
        double nMatricula = sc.nextDouble();

        if (nMatricula >= 1 && nMatricula <= 250) {
            System.out.println("Time do Chris");
        } else if (nMatricula >= 251 && nMatricula <= 500) {
            System.out.println("Time do Greg");
        } else if (nMatricula >= 501 && nMatricula <= 750) {
            System.out.println("Time do Caruso");
        } else if (nMatricula >= 751 && nMatricula <= 1001) {
            System.out.println("Time do Jerome");
        } else {
            System.out.println("Erro Digite Novamente");
        }

    }
    // ==============================================================================================

    public void freeFruit() {

        System.out.println("Tabela de Preços do FreeFruit:");
        System.out.println("");
        System.out.println("Morangos – R$ 2,50 o kilo;");
        System.out.println("Maças – R$ 1,80 o kilo;");
        System.out.println("Bananas – R$ 1,30 o kilo;");
        System.out.println("");

        System.out.println("Digite o numero de Morangos a serem adquiridos em Quilos:");
        double nMorangos = sc.nextDouble();

        System.out.println("Digite o numero de Maças a serem adquiridos em Quilos:");
        double nMaca = sc.nextDouble();

        System.out.println("Digite o numero de Banana a serem adquiridos em Quilos:");
        double nBanana = sc.nextDouble();

        double pecoMorangos = 2.50;
        double pecoMaca = 1.80;
        double pecoBanana = 1.30;

        double pesoQuilo = (nBanana + nMaca + nMorangos);
        System.out.println("Peso dos Itens Comprados:" + pesoQuilo);

        double valTotalMorango = (nMorangos * pecoMorangos);
        double valTotalMaca = (nMaca * pecoMaca);
        double valTotalBanana = (nBanana * pecoBanana);

        System.out.println("Valor dos Morangos Adquiridos:" + valTotalMorango);
        System.out.println("Valor dos Maça Adquiridos:" + valTotalMaca);
        System.out.println("Valor dos Banana Adquiridos:" + valTotalBanana);

        double valCompra = (valTotalMorango + valTotalMaca + valTotalBanana);
        System.out.println("Valor Total dos ItenS Comprados SEM DESCONTO" + valCompra);

        if ((pesoQuilo > 8) || (valCompra > 25)) {

            double desconto = 0.10;

            double valDescontoPeco = (valCompra - (valCompra * desconto));

            System.out.println("O Valor Com Desconto é" + valDescontoPeco);

        } else {
            System.out.println("");

        }

    }

}