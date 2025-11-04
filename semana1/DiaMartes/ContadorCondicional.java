package semana1.DiaMartes;

import java.util.Scanner;

public class ContadorCondicional {
    public static void main(String[] args) {

        // Declaramos Variables
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        int numero;

        do {
            System.out.print("Ingrese un numero (negativo para salir):");
            numero = scan.nextInt();
            if (numero >= 0) {

                contador++;

            }

        } while (numero >= 0);

        System.out.println("Cantidad de numeros ingresados: " + contador);
        scan.close();

    }
}
