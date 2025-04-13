package Algoritmo480;

public class Capicua {

    public static boolean ehCapicua(int numero) {

        String numeroStr = String.valueOf(numero);

        int comprimento = numeroStr.length();

        for (int i = 0; i < comprimento / 2; i++) {
            if (numeroStr.charAt(i) != numeroStr.charAt(comprimento - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
