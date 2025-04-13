package Algoritmo495;

public class Nomes {
    private String[] vetorNomes;

    public Nomes(String[] nomes) {
        this.vetorNomes = nomes;
    }

    public void ordenar() {
        for (int i = 0; i < vetorNomes.length - 1; i++) {
            for (int j = i + 1; j < vetorNomes.length; j++) {
                if (vetorNomes[i].compareTo(vetorNomes[j]) > 0) {
                    String temp = vetorNomes[i];
                    vetorNomes[i] = vetorNomes[j];
                    vetorNomes[j] = temp;
                }
            }
        }
    }

    public void exibirOrdenados() {
        System.out.println("\nNOMES ORDENADOS");
        System.out.println();
        for (int i = 0; i < vetorNomes.length; i++) {
            System.out.println((i + 1) + " - " + vetorNomes[i]);
        }
    }
}