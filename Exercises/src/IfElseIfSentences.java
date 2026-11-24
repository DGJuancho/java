import java.util.Scanner;

public class IfElseIfSentences {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Por favor puedes indicar tu edad:");
        int age = keyboard.nextInt();

        if (age < 18) {
            System.out.println("Usted es menor de edad");
        }
        else if (age < 40) {
            System.out.println("Usted es un adulto");
        }

        else if (age < 60) {
            System.out.println("Usted es un adulto contemporáneo");
        }
        else {
            System.out.println("No mames wey, ya estas muy viejo");
        }

        System.out.println("\n ---Validar la letra---");

        keyboard.nextLine();

        System.out.println("Ingresa una letra cualquiera:");
        String letter = keyboard.nextLine();

        if (letter.equals ("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.println("La letra que introdujiste es una vocal minúscula");
        }
        
        else if (letter.equals("A") || letter.equals("E") || letter.equals("I") || letter.equals("O") || letter.equals("U")){
            System.out.println("La letra que introdujiste es una vocal mayúscula");
        }
        
        else {
            System.out.println("La letra que introdujiste es una consonante o cualquier otra vaina");
        }


        keyboard.close();
    }

}
