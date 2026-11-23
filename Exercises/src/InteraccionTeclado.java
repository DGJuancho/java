import java.util.Scanner;

public class InteraccionTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¡Hola! ¿Cómo te llamas?");
        String nombre = teclado.nextLine();
        System.out.println("Mucho gusto, " + nombre + ". ¿Que cuántos años tienes?");
        int edad = teclado.nextInt();
        System.out.println("Excelente, Tu nombre es " + nombre + " y tienes " + edad + " años.");
        teclado.close();
    }
}
