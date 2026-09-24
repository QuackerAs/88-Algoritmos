public class Punto34 {
    static void calcularAumento(int categoria, double sueldo) {
        double aumento = 0;
        if (categoria == 1) {
            aumento = sueldo * 0.15;
        } else if (categoria == 2) {
            aumento = sueldo * 0.10;
        } else if (categoria == 3) {
            aumento = sueldo * 0.08;
        } else if (categoria == 4) {
            aumento = sueldo * 0.07;
        }
        double nuevoSueldo = sueldo + aumento;
        System.out.println("Categoría del trabajador: " + categoria);
        System.out.println("Nuevo sueldo: " + nuevoSueldo);
    }
    public static void main(String[] args) {
        calcularAumento(2, 1500000);
    }
}