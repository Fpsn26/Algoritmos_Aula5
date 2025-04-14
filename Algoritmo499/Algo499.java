package Algoritmo499;

import java.util.Scanner;

public class Algo499 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vetor vetor = new Vetor();
        int opcao;
        boolean sair = false;

        System.out.println("ALGORITMO 499");
        System.out.println("Entrada do VETOR");
        System.out.println("Digite número 1-23");

        while (!sair) {
            System.out.println("\nMENU VETOR - FUNÇÃO");
            System.out.println("1. Dados do VETOR");
            System.out.println("2. Ordena VETOR");
            System.out.println("3. Imprime VETOR");
            System.out.println("4. Sair do programa");
            System.out.print("OPÇÃO: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite os 5 valores do vetor:");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Digite o valor " + (i + 1) + ": ");
                        int valor = scanner.nextInt();
                        vetor.inserirValor(i, valor);
                    }
                    break;

                case 2:
                    vetor.ordenarVetor();
                    System.out.println("Vetor ordenado com sucesso!");
                    break;

                case 3:
                    vetor.imprimirVetor();
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida! Escolha um número entre 1 e 4.");
            }
        }

        scanner.close();
    }
}