package Algoritmo460;
import java.util.Scanner;

public class Algo460 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dobro x = new Dobro();

        for(int c = 1; c <=3; c++){
            System.out.println("Digite um número: ");
            x.setX(scan.nextInt());
            System.out.println("Dobro: " + x.getX());
        }

        scan.close();
    }
}
