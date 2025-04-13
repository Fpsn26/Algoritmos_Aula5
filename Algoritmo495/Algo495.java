package Algoritmo495;

import java.util.Scanner;

public class Algo495 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int QUANTIDADE_NOMES = 5;
        String[] vetorNomes = new String[QUANTIDADE_NOMES];

        for (int i = 0; i < QUANTIDADE_NOMES; i++) {
            System.out.print("Digite nome: ");
            vetorNomes[i] = scanner.nextLine().toUpperCase();
        }

        Nomes nomes = new Nomes(vetorNomes);

        nomes.ordenar();

        nomes.exibirOrdenados();

        scanner.close();
    }
}