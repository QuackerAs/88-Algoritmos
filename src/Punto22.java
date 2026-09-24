public class Punto22 {
    static void compu(double precioContado, double precioCuotas){
        double financiado = precioCuotas * 12;
        double recargoNeto = financiado - precioContado;
        double recargo = (recargoNeto/precioContado)*100;
        System.out.println("El recargo por el pago a cuotas es del: " + recargo + " %");
    }
    public static void main(String[] args) {
        compu(1500000, 150000);
    }
}
