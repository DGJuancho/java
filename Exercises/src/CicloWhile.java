import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Por favor ingresa un numero:");
        int numberUser = keyboard.nextInt();
        int count = 0;

        while (numberUser != 0) {
            System.out.println("Por favor ingresa un numero:");
            numberUser = keyboard.nextInt();
            count += 1;
        }
        
        System.out.println("El usuario ingreso " + count + " números, antes de pulsar  el 0");
    
        keyboard.close();
    }
}
