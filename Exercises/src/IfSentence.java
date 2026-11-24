import java.util.Scanner;


public class IfSentence {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor introduce el primer número: ");
        double number1 = teclado.nextDouble();
        System.out.println("Por favor introduce el segundo número: ");
        double number2 = teclado.nextDouble();

        if (number1 > number2) {
            System.out.println("El número 1: " + number1 + " es mayor que el número 2: " + number2);
        }
        if (number1 < number2) {
            System.out.println("El número 2: " + number2 + " es mayor que el número 1: " + number1);
        }
        teclado.close();
    }
}
