package Algoritmo490;

public class Nomes {
    private char[] vetorDeCaracteres;

    public Nomes(String texto) {
        this.vetorDeCaracteres = texto.toCharArray();
    }

    public int substituiCaractere(char caractereBuscado) {
        int contador = 0;

        for (int i = 0; i < vetorDeCaracteres.length; i++) {
            if (vetorDeCaracteres[i] == caractereBuscado) {
                vetorDeCaracteres[i] = '*';
                contador = contador + 1;
            }
        }

        return contador;
    }

    public String obterTextoModificado() {
        return new String(vetorDeCaracteres);
    }
}