import java.util.Scanner;

public class BucleFor {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== TABLA DE MULTIPLICAR ===");
        System.out.println("Por favor ingresa que tabla quieres observar: ");

        int numeroBase = teclado.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = numeroBase * i;
            System.out.println(numeroBase + " x " + i + " = " + resultado);
        }





        teclado.close();
    }
}
