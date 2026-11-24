// Transformar un par de fórmulas algebraicas complejas (incluyen paréntesis y fracciones) a código, respetando la jerarquía de los operadores.

import java.util.Scanner;


public class FormulasAlgebraicas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=".repeat(30));
        System.out.println("  Cálculo de cuota periódica  ");
        System.out.println("=".repeat(30));

        System.out.println("\nPor favor indica el monto del préstamo: ");
        double capital = teclado.nextDouble();

        System.out.println("Ahora, indica la tasa de interés vigente (%): ");
        double tasaInteres = teclado.nextDouble() / 100;

        System.out.println("Ahora, indica la cantidad de cuotas por año: ");
        int cantidadPagos = teclado.nextInt();

        System.out.println("Finalmente indica la cantidad de años del crédito: ");
        int cantidadYears = teclado.nextInt();

        double cuota = (capital * (tasaInteres / cantidadPagos))
                / (1 - Math.pow(1 + (tasaInteres / cantidadPagos), (-cantidadPagos * cantidadYears)));
        
        cuota = (Math.round(cuota * 100.0) / 100.0);
        
        System.out.println("El monto de cada cuota es: " + cuota);

        System.out.println();
        System.out.println("=".repeat(31));
        System.out.println("  Ecuación Racional Compuesta  ");
        System.out.println("=".repeat(31));

        System.out.println("Por favor indica el valor de a: ");
        double a = teclado.nextInt();
        System.out.println("Por favor indica el valor de b: ");
        double b = teclado.nextInt();
        System.out.println("Por favor indica el valor de c: ");
        double c = teclado.nextInt();
        System.out.println("Por favor indica el valor de d: ");
        double d = teclado.nextInt();
        System.out.println("Por favor indica el valor de x: ");
        double x = teclado.nextInt();
        System.out.println("Por favor indica el valor de y: ");
        double y = teclado.nextInt();
        System.out.println("Por favor indica el valor de z: ");
        double z = teclado.nextInt();

        double numeradorPrincipal = (Math.pow((a + b) / (c - d), 2)) - ((3 * (x - y)) / (z + 1));
        double denominadorPrincipal = ((2 * a) / (b+c))+(Math.pow((d/(x+y)),3)) ;

        double resultado = numeradorPrincipal / denominadorPrincipal;
        
        resultado = (Math.round(resultado * 100.0) / 100.0);

        System.out.println("El resultado del numerador es: " + numeradorPrincipal);
        System.out.println("El resultado del denominador es: " + denominadorPrincipal);
        System.out.println("El resultados de la ecuación racional compuesta es: " + resultado);
        teclado.close();
    }
}
