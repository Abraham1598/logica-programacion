package semana1.DiaMiercoles;

import java.util.Scanner;

public class ElMayor {

    public static void main(String[] args) {

        // Declaramos Variable
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3, mayor;

        System.out.println("Ingrese el primer numero:");
        num1 = scan.nextInt();

        System.out.println("Ingrese el segundo numero:");
        num2 = scan.nextInt();

        System.out.println("Ingrese el tercer numero:");
        num3 = scan.nextInt();

        // Encontrar el mayor
        mayor = num1;
        if (num2 > mayor) {
            mayor = num2;

        } else if (num3 > mayor) {
            mayor = num3;

        }
        System.out.println("El mayor de los tres numeros es: " + mayor);
        scan.close();
    }

}
