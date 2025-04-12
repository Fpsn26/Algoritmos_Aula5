package Algoritmo470;
import java.util.Scanner;

public class Algo470 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Primo x = new Primo();

        System.out.println("Digite um número maior que 0: ");
        x.setN(scan.nextInt());

        if(x.isPrimo()){
            System.out.println("É primo!");
        } else {
            System.out.println("Não é primo!");
        }

        scan.close();
    }
}