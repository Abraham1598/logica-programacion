package semana1.DiaJueves;
import java.util.Scanner;

public class EdadLegal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int edad = scan.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        scan.close();
    }
}