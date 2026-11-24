import java.util.Scanner;

public class RangoDemogafico {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor indique su edad: ");
        int edad = teclado.nextInt();
        boolean rangoDemografico = 18 <= edad && edad <= 25;

        System.out.println("El usuario se encuentra dentro del Rango Demográfico de 18 a 25 años?\n" + rangoDemografico);
        teclado.close();
    }
}
