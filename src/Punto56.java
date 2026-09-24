public class Punto56 {
    static void divisionRestas(int dividendo, int divisor) {
        int cociente = 0;
        int resto = dividendo;

        while (resto >= divisor) {
            resto -= divisor;
            cociente++;
        }

        System.out.println("El resultado de dividir " + dividendo + " entre " + divisor + " es:");
        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);
    }
    public static void main(String[] args) {
        divisionRestas(8, 7);
    }
}