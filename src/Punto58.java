public class Punto58 {
    static void interesDiario(double capital, double tasaAnual, int semanas) {
        int dias = semanas * 7;

        for (int i = 0; i < dias; i++) {
            double interes = (tasaAnual * capital) / 365.0;
            capital += interes;
        }

        System.out.printf("El capital total acumulado al final es: $%.2f\n", capital);
    }
    public static void main(String[] args) {
        interesDiario(1000.0, 0.06, 4); // tasa en decimal 6% -> 0.06
    }
}