public class Punto43 {
    static void planificarPresupuesto(double capitalActual) {
        double prestamo = 0;
        double nuevoSaldo = capitalActual;

        if (capitalActual < 0) {
            prestamo = 10000 - capitalActual;
            nuevoSaldo = 10000;
        } else if (capitalActual >= 0 && capitalActual <= 20000) {
            prestamo = 20000 - capitalActual;
            nuevoSaldo = 20000;
        } else if (capitalActual > 20000) {
            prestamo = 0;
            nuevoSaldo = capitalActual;
        }

        double equipoComputo = 5000;
        double mobiliario = 2000;
        double resto = nuevoSaldo - equipoComputo - mobiliario;
        double insumos = resto / 2.0;
        double incentivos = resto / 2.0;

        System.out.println("Cantidad pedida al banco: $" + prestamo);
        System.out.println("Destinado para insumos: $" + insumos);
        System.out.println("Destinado para incentivos: $" + incentivos);
    }
    public static void main(String[] args) {
        planificarPresupuesto(5000);
    }
}