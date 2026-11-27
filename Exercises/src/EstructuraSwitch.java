import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcionSeleccionada;

        do 
        {System.out.println("Bienvenido a su Cajero Automático");
        System.out.println("por favor elija una de las siguientes opciones:");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Sacar dinero");
        System.out.println("4. Consultar últimos movimientos");
        System.out.println("5. Salir");
        opcionSeleccionada = teclado.nextInt();

        switch (opcionSeleccionada) {
            case 1:
                System.out.println("Su saldo es: xxxxx"); break;
            case 2:
                System.out.println("Por favor introduzca el monto a ingresar: "); break;
            case 3:
                System.out.println("Por favor ingrese el monto a retirar: "); break;
            case 4:
                System.out.println("Los últimos movimientos de su cuenta:"); break;
            case 5:
                System.out.println("Gracias por utilizar nuestros servicios."); break;
            default:
                System.out.println("Esa no es una opción válida. Gracias por utilizar nuestros servicios."); break;
        }
    } while (opcionSeleccionada != 5);
        teclado.close();
    }
}
