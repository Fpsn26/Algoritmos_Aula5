package Algoritmo500;

public class Algo500 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Vetor vetorA = new Vetor();
        Vetor vetorB = new Vetor();
        Vetor resultado;
        int opcao;

        do {
            System.out.println("\nVETORES");
            System.out.println("1. Dados do VETOR A");
            System.out.println("2. Dados do VETOR B");
            System.out.println("3. Imprime VETORES");
            System.out.println("4. Soma VETORES");
            System.out.println("5. Subtrai VETORES");
            System.out.println("6. Sai do programa");
            System.out.print("OPÇÃO: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    vetorA.lerDados(scanner);
                    break;

                case 2:
                    vetorB.lerDados(scanner);
                    break;

                case 3:
                    System.out.println("VETOR A:");
                    vetorA.imprimir();
                    System.out.println("VETOR B:");
                    vetorB.imprimir();
                    break;

                case 4:
                    resultado = Vetor.somar(vetorA, vetorB);
                    System.out.println("Resultado da soma:");
                    resultado.imprimir();
                    break;

                case 5:
                    resultado = Vetor.subtrair(vetorA, vetorB);
                    System.out.println("Resultado da subtração (A - B):");
                    resultado.imprimir();
                    break;

                case 6:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 6);

        scanner.close();
    }
}