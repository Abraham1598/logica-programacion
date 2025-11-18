package semana1.viernes;

import java.util.Scanner;

public class CalculadoraBasic {

    public static void main(String[] args) {

        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scan = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números enteros
        System.out.println("Ingrese el primer numero entero:");
        int numero1 = scan.nextInt();

        System.out.println("Ingrese el segundo numero entero:");
        int numero2 = scan.nextInt();

        // Realizar las operaciones aritméticas
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        if (numero2 != 0) {
            int divisionEntera = numero1 / numero2;
            int modulo = numero1 % numero2;
            System.out.println("Division Entera: " + divisionEntera);
            System.out.println("Modulo: " + modulo);
        } else {
            System.out.println("Division Entera: No se puede dividir por cero");
            System.out.println("Modulo: No se puede calcular el modulo con divisor cero");
        }

        // Cerrar el objeto Scanner
        scan.close();

        // Mostrar los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);

    }
}
