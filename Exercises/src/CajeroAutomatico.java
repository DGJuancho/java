import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("Bienvenido a su Cajero Automático");
        System.out.println("por favor elija una de las siguientes opciones:");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Sacar dinero");
        System.out.println("4. Consultar últimos movimientos");
        Scanner teclado = new Scanner(System.in);
        int opcionSeleccionada = teclado.nextInt();
        System.out.println("La opción seleccionada es: " + opcionSeleccionada);
        teclado.close();
    }
}
