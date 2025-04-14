package Algoritmo499;

class Vetor {
    private int[] vetor;

    public Vetor() {
        vetor = new int[5];
    }

    public void inserirValor(int posicao, int valor) {
        if (posicao >= 0 && posicao < vetor.length) {
            vetor[posicao] = valor;
        }
    }

    public void ordenarVetor() {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public void imprimirVetor() {
        System.out.println("\nValores do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}