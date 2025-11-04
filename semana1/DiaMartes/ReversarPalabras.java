package semana1.DiaMartes;

import java.util.Scanner;

public class ReversarPalabras {
    public static void main(String[] args) {

        // Declarando Variables
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa una palabra ");
        String palabra = scan.nextLine();

        String invertida = "";
        int i = palabra.length() - 1;

        while (i >= 0) {
            invertida += palabra.charAt(i);
            i--;

        }
        System.out.println("La palabra invertida es: " + invertida);
        scan.close();

    }
}
