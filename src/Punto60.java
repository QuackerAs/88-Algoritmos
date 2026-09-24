public class Punto60 {
    static void automatizarFacturas(int cantFacturas) {
        for (int i = 1; i <= cantFacturas; i++) {
            int numCli = 1000 + i;
            double monto = 5000 + (Math.random() * 15000);
            int diasTranscurridos = (int) (Math.random() * 90);

            double interes = 0;
            double descuento = 0;

            if (diasTranscurridos > 60) {
                interes = monto * 0.08;
            } else if (diasTranscurridos >= 31 && diasTranscurridos <= 59) {
                interes = monto * 0.06;
            } else if (diasTranscurridos < 15) {
                descuento = monto * 0.02;
            }

            double montoAPagar = monto + interes - descuento;

            System.out.println("-----------------------------------");
            System.out.println("Num Factura: " + i);
            System.out.println("Cliente: " + numCli);
            System.out.printf("Monto Base: %.2f Bs\n", monto);
            System.out.printf("Días transcurridos: %d\n", diasTranscurridos);
            System.out.printf("Mora agregada: %.2f Bs\n", interes);
            System.out.printf("Descuento pronto pago: %.2f Bs\n", descuento);
            System.out.printf("Total final a pagar: %.2f Bs\n", montoAPagar);
        }
    }
    public static void main(String[] args) {
        automatizarFacturas(5);
    }
}