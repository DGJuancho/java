public class CambioVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("El valor de a es: " + a + ", el valor de b es: " + b);
        int temp = a;

        a = b;
        b = temp;

        System.out.println("El nuevo valor de a es: " + a + ", el nuevo valor de b es: " + b);
    }
}