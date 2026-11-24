import java.util.Scanner;


public class AprobarCurso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        double minimaAprobatoria = 10;
        double teoria = 0.60;
        double practica = 0.30;
        double participacion = 0.10;

        System.out.println("Hola, por favor indica el valor obtenido en teoría");
        double notaTeoria = teclado.nextInt() * teoria;
        System.out.println("Ahora por favor indica el valor obtenido en práctica");
        double notaPractica= teclado.nextInt() * practica;
        System.out.println("Finalmente, indica indica el valor obtenido en participación");
        double notaParticipacion = teclado.nextInt() * participacion;

        double totalNotas = notaTeoria + notaPractica + notaParticipacion;

        boolean aprobado = totalNotas >= minimaAprobatoria;

        System.out.println("\nLa nota total del curso del alumno es: " + totalNotas + " puntos.\n");

        System.out.println("El alumno ha sido Aprobado? " + aprobado);

        teclado.close();
    }
}
