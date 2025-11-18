package semana1.DiaMiercoles;

import java.util.Scanner;

public class Saludoper {
    public static void main(String[] args) {

        // Declaramos Variables
        Scanner scan = new Scanner(System.in);
        String nombre;
        int edad;

        System.out.println("Ingrese su nombre:");
        nombre = scan.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = scan.nextInt();

        if (edad < 0) {
            System.out.println("La edad no puede ser negativa.");
        } else {

            System.out.println("Hola," + nombre + ". Tenes " + edad + " años.");
        }
        scan.close();

    }
}
