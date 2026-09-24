public class Punto40 {
    static void calcularRecibo(int lecturaAnterior, int lecturaActual) {
        int consumo = lecturaActual - lecturaAnterior;
        double monto = 0;

        if (consumo >= 0 && consumo <= 100) {
            monto = consumo * 2622.00;
        } else if (consumo >= 101 && consumo <= 300) {
            monto = consumo * 79.78;
        } else if (consumo >= 301 && consumo <= 500) {
            monto = consumo * 89.52;
        } else if (consumo > 500) {
            monto = consumo * 97.95;
        }

        System.out.println("Consumo de Kwh: " + consumo);
        System.out.printf("Monto total a pagar: %.2f Bs\n", monto);
    }
    public static void main(String[] args) {
        calcularRecibo(1500, 1850);
    }
}