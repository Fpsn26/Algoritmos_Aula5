package Algoritmo380;
import java.util.Scanner;

public class Algo380 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        
        for (int num : numero) {
            if (Capicua.ehCapicua(num)) {
                System.out.println(num + " é um número capicua.");
            } else {
                System.out.println(num + " não é um número capicua.");
            }
        }

        scan.close();
    }
}