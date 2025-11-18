package semana1.DiaMiercoles;

import java.util.Scanner;

public class Vocales {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 0;

        System.out.print("Ingrese una frase o palabra: ");
        String texto = scan.nextLine().toLowerCase(); // Convertimos a minúsculas

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        System.out.println("La cantidad de vocales es: " + contador);
        scan.close();
    }
}