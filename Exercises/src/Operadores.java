public class Operadores {
    public static void main(String[] args) {
        double precioProducto = 25.50;
        int cantidad = 3;
        double costoEnvio = 5.00;
        double descuento = 2.50;
        double subtotal = precioProducto * cantidad;
        double totalPagar = (subtotal + costoEnvio) - descuento;
        int amigos = 2;
        double pagoPorPersona = totalPagar / amigos;
        System.out.println("El total a pagar es: " + totalPagar);
        System.out.println("Cada persona debe pagar: " + pagoPorPersona);
    }
}
