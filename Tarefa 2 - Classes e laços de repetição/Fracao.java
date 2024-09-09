package org.example;

import java.util.Scanner;

public class Fracao{
    private int numerador, denominador;

    public Fracao(int numerador, int denominador) {
        if (denominador == 0) throw new IllegalArgumentException("Denominador não pode ser zero.");
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    private void simplificar() {
        int mdc = mdc(numerador, denominador);
        numerador /= mdc;
        denominador /= mdc;
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
    }

    private int mdc(int a, int b) {
        return (b == 0) ? a : mdc(b, a % b);
    }

    public Fracao somar(Fracao outra) {
        return new Fracao(
                this.numerador * outra.denominador + outra.numerador * this.denominador,
                this.denominador * outra.denominador
        );
    }

    public Fracao subtrair(Fracao outra) {
        return new Fracao(
                this.numerador * outra.denominador - outra.numerador * this.denominador,
                this.denominador * outra.denominador
        );
    }

    public Fracao multiplicar(Fracao outra) {
        return new Fracao(this.numerador * outra.numerador, this.denominador * outra.denominador);
    }

    public Fracao dividir(Fracao outra) {
        if (outra.numerador == 0) throw new IllegalArgumentException("Divisão por zero.");
        return new Fracao(this.numerador * outra.denominador, this.denominador * outra.numerador);
    }

    @Override
    public String toString() {
        return (denominador == 1) ? String.valueOf(numerador) : numerador + "/" + denominador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas frações você deseja inserir? ");
        int quantidade = scanner.nextInt();

        Fracao[] fracoes = new Fracao[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Numerador e denominador da fração " + (i + 1) + ": ");
            fracoes[i] = new Fracao(scanner.nextInt(), scanner.nextInt());
        }

        int opcao;
        do {
            System.out.println("1-Soma 2-Subtração 3-Multiplicação 4-Divisão 5-Sair");
            opcao = scanner.nextInt();

            if (opcao == 5) break;

            Fracao resultado = fracoes[0];
            for (int i = 1; i < quantidade; i++) {
                switch (opcao) {
                    case 1: resultado = resultado.somar(fracoes[i]); break;
                    case 2: resultado = resultado.subtrair(fracoes[i]); break;
                    case 3: resultado = resultado.multiplicar(fracoes[i]); break;
                    case 4: resultado = resultado.dividir(fracoes[i]); break;
                    default: System.out.println("Opção inválida."); break;
                }
            }

            if (opcao >= 1 && opcao <= 4) System.out.println("Resultado: " + resultado);
        } while (opcao != 5);

        scanner.close();
    }
}

/* Teste de Mesa 2 + 1/3 - 5/4 :

| Passo | Descrição                            | num1 | den1 | num2 | den2 | Operação        | Calculo                               | Resultado |
|-------|--------------------------------------|------|------|------|------|-----------------|---------------------------------------|-----------|
| 1     | Criação da fração 1/3                | 1    | 3    |      |      | Simplificação   | 1/3                                   | 1/3       |
| 2     | Criação da fração 5/4                | 5    | 4    |      |      | Simplificação   | 5/4                                   | 5/4       |
| 3     | Soma de 2 e 1/3                      | 2    | 1    | 1    | 3    | Soma            | (2 * 3 + 1 * 1) / 3 = (6 + 1) / 3     | 7/3       |
| 4     | Subtração de 7/3 - 5/4               | 7    | 3    | 5    | 4    | Subtração       | (7 * 4 - 5 * 3) / (3 * 4) = (28 - 15) / 12 | 13/12|

Resultado final: 13/12
*/

/* Teste de Mesa 5/2 * (4/3 - 2/5) :

| Passo | Descrição                          | num1 | den1 | num2 | den2 | Operação        | Calculo                               | Resultado |
|-------|--------------------------------------|------|------|------|------|-----------------|---------------------------------------|-----------|
| 1     | Criação da fração 5/2                | 5    | 2    |      |      | Simplificação   | 5/2                                   | 5/2       |
| 2     | Criação da fração 4/3                | 4    | 3    |      |      | Simplificação   | 4/3                                   | 4/3       |
| 3     | Criação da fração 2/5                | 2    | 5    |      |      | Simplificação   | 2/5                                   | 2/5       |
| 4     | Subtração de 4/3 - 2/5               | 4    | 3    | 2      | 5  | Subtração       | (4 * 5 - 2 * 3) / (3 * 5) = (20 - 6) / 15| 14/15  |
| 5     | Multiplicação de 5/2 * 14/15         | 5    | 2    | 14   | 15   | Multiplicação   | (5 * 14) / (2 * 15) = 70 / 30         | 7/3       |

Resultado final: 7/3
*/