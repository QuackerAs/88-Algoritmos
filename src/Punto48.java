public class Punto48 {
    static void tablaTemperaturas(int inicioF, int finF, int intervalo) {
        System.out.println("Fahrenheit\tCelsius\t\tKelvin\t\tRankine");
        for (int f = inicioF; f <= finF; f += intervalo) {
            double c = 5.0 * (f - 32) / 9.0;
            double r = f + 459.67;
            double k = c + 273.15;
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", f, c, k, r);
        }
    }
    public static void main(String[] args) {
        tablaTemperaturas(28, 54, 1);
        System.out.println("---------------------------------------------------");
        tablaTemperaturas(450, 950, 50);
        System.out.println("---------------------------------------------------");
        tablaTemperaturas(-50, 250, 10);
    }
}