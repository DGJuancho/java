import java.util.Scanner;

public class ParqueAtracciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Atracciones Mecánicas ---\n");

        System.out
                .println("Bienvenidos al Parque de Atracciones, por favor indicar cuántos adultos vienen en el grupo:");
        int adultos = teclado.nextInt();
        System.out.println("Por favor indicar cuántos niños vienen en el grupo:");
        double kids = teclado.nextInt();
        System.out.println("Por favor indicar el promedio de edad de los niños:");
        int promKids = teclado.nextInt();

        boolean highRiskAtraction = adultos >= (kids / 2) || promKids >= 15;

        System.out.println(
                "De acuerdo a nuestras políticas, se verificó y las atracciones de Alto riesgo están disponibles: "
                        + highRiskAtraction);

        teclado.close();
    }
}
