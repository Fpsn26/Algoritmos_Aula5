package Algoritmo480;

import java.util.Scanner;

public class Algo480 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        if (Capicua.ehCapicua(numero)) {
            System.out.println(numero + " é um número capicua.");
        } else {
            System.out.println(numero + " não é um número capicua.");
        }

        scan.close();
    }
}