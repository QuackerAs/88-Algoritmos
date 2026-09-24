public class Punto44 {
    static void calcularInversion(double montoHipoteca, double inversionTotal) {
        double inversionPersona = 0;
        double inversionSocio = 0;

        if (montoHipoteca < 1000000) {
            inversionPersona = inversionTotal * 0.50;
            inversionSocio = inversionTotal * 0.50;
        } else {
            double resto = inversionTotal - montoHipoteca;
            inversionPersona = montoHipoteca + (resto / 2.0);
            inversionSocio = resto / 2.0;
        }

        System.out.println("Inversión de la persona: $" + inversionPersona);
        System.out.println("Inversión del socio: $" + inversionSocio);
    }
    public static void main(String[] args) {
        calcularInversion(1200000, 2000000);
    }
}