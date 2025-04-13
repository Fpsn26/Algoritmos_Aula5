package Algoritmo497;

import java.util.Scanner;
import java.util.Arrays;

public class Algo497 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite numero " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        Arrays.sort(vetor);

        System.out.println("\nVETOR ORDENADO:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println((i + 1) + " - " + vetor[i]);
        }

        System.out.print("\nDigite numero de busca: ");
        int chave = scanner.nextInt();

        int posicao = Numeros.buscaBinaria(vetor, tamanho, chave);

        if (posicao == -1) {
            System.out.println("NÃO ENCONTRADO");
        } else {
            System.out.println("posicao no vetor: " + (posicao + 1));
        }

        scanner.close();
    }
}