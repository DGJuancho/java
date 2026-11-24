import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduce 3 números enteros:");

        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        int number3 = keyboard.nextInt();

        int majorNumber = (number1 > number2 && number1 > number3) ? number1 : (number2 > number3) ? number2 : number3;

        System.out.println("El numero mayor es el numero: " + majorNumber);

        keyboard.close();
    }   
}
