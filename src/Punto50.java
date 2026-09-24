public class Punto50 {
    static void sumarPares() {
        long suma = 0;
        for (int i = 97; i <= 1003; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de todos los números pares es: " + suma);
    }
    public static void main(String[] args) {
        sumarPares();
    }
}