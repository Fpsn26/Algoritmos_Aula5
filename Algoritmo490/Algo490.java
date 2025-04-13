package Algoritmo490;

import java.util.Scanner;

public class Algo490 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantas palavras você deseja inserir?");
        int quantidadePalavras = leitor.nextInt();
        leitor.nextLine();

        String[] palavras = new String[quantidadePalavras];
        Nomes[] objetosNomes = new Nomes[quantidadePalavras];

        for (int i = 0; i < quantidadePalavras; i++) {
            System.out.println("Digite a palavra " + (i + 1) + ":");
            palavras[i] = leitor.nextLine();
            objetosNomes[i] = new Nomes(palavras[i]);
        }

        System.out.println("\nDigite o caractere que deve ser substituído por '*':");
        char caractereBuscado = leitor.next().charAt(0);

        int totalGeralSubstituicoes = 0;

        System.out.println("\nResultados:");
        for (int i = 0; i < quantidadePalavras; i++) {
            int substituicoesNaPalavra = objetosNomes[i].substituiCaractere(caractereBuscado);
            totalGeralSubstituicoes += substituicoesNaPalavra;

            System.out.println("\nPalavra " + (i + 1) + " após substituições:");
            System.out.println(objetosNomes[i].obterTextoModificado());
            System.out.println("Substituições nesta palavra: " + substituicoesNaPalavra);
        }

        System.out.println("\nTotal geral de caracteres substituídos: " + totalGeralSubstituicoes);

        leitor.close();
    }
}