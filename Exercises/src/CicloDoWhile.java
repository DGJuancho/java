import java.util.Scanner;

public class CicloDoWhile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int number;
        
        do {
            System.out.print("¿Por favor ingrese un numero?: ");
            number = keyboard.nextInt();
        } while (number <= 0);

        long first = 0;
        long second = 1;

        for (int i = 0; i < number; i++) {
            System.out.print(first + (i < number - 1 ? ", " : ""));
            long siguiente = first + second;
            first = second;
            second = siguiente;
        }
        System.out.println();
        keyboard.close();
    }
}
