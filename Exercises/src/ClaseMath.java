public class ClaseMath {
    public static void main(String[] args) {
        double ladoHabitacion = 5.0;
        double areaHabitacion = Math.pow(ladoHabitacion, 2);
        double baseTriangulo = 3.0;
        double alturaTriangulo = 4.0;
        double hipotenusa = Math.sqrt(Math.pow(baseTriangulo, 2) + Math.pow(alturaTriangulo, 2));

        System.out.println("El área de la habitación es: " + areaHabitacion);
        System.out.println("La medida del cable adiagonal es: " + hipotenusa);
    }
}
