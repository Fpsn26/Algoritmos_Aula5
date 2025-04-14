package Algoritmo500;

class Vetor {
    private double[] elementos;
    private int tamanho;
    
    public Vetor() {
        this.tamanho = 5;
        this.elementos = new double[tamanho];
    }
    
    public void lerDados(java.util.Scanner scanner) {
        System.out.println("Digite os " + tamanho + " elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            elementos[i] = scanner.nextDouble();
        }
    }
    
    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static Vetor somar(Vetor a, Vetor b) {
        Vetor resultado = new Vetor();
        
        for (int i = 0; i < resultado.tamanho; i++) {
            resultado.elementos[i] = a.elementos[i] + b.elementos[i];
        }
        
        return resultado;
    }
    
    public static Vetor subtrair(Vetor a, Vetor b) {
        Vetor resultado = new Vetor();
        
        for (int i = 0; i < resultado.tamanho; i++) {
            resultado.elementos[i] = a.elementos[i] - b.elementos[i];
        }
        
        return resultado;
    }
}