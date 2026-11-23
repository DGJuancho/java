import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor indica la primera nota");
        int nota1 = teclado.nextInt();
        System.out.println("Por favor indica la segunda nota");
        int nota2 = teclado.nextInt();
        System.out.println("Por favor indica la tercera nota");
        int nota3 = teclado.nextInt();
        
        double promedio = (nota1 + nota2 + nota3) / 3.00;

        // Uso Math.round para truncar a 2 cifras los decimales si, quiero colocar 3 cifras adiciono un 0 a la multiplicación y división.
        promedio = (Math.round(promedio * 100.0)/100.0);

        System.out.println("El promedio de tus calificaciones es: " + promedio);
        teclado.close();
    }
}
