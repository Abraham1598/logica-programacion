package semana1.viernes;

import java.util.Scanner;

public class ValidacionEdad {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scan = new Scanner(System.in);

        // Solicitar al usuario que ingrese su edad
        System.out.print("Por favor, ingrese su edad:");
        int edad = scan.nextInt();

        // EVALUAR CONDICIONES
        boolean esMayorDeEdad = edad >= 18;
        boolean esPar = edad % 2 == 0;
        boolean esMayorDeEdadYPar = esMayorDeEdad && esPar;

        // Mostrar los resultados de las evaluaciones
        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
        System.out.println("¿Es par? " + esPar);
        System.out.println("¿Es mayor de edad y par? " + esMayorDeEdadYPar);

        // Cerrar el objeto Scanner
        scan.close();

    }
}
