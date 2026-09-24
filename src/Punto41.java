public class Punto41 {
    static void calcularArboles(double hectareas) {
        double metrosCuadrados = hectareas * 10000;
        double areaPino = 0;
        double areaOyamel = 0;
        double areaCedro = 0;

        if (metrosCuadrados > 1000000) {
            areaPino = metrosCuadrados * 0.70;
            areaOyamel = metrosCuadrados * 0.20;
            areaCedro = metrosCuadrados * 0.10;
        } else {
            areaPino = metrosCuadrados * 0.50;
            areaOyamel = metrosCuadrados * 0.30;
            areaCedro = metrosCuadrados * 0.20;
        }

        double numPinos = areaPino * (8.0 / 10.0);
        double numOyameles = areaOyamel * (15.0 / 15.0);
        double numCedros = areaCedro * (10.0 / 18.0);

        System.out.println("Pinos a sembrar: " + Math.round(numPinos));
        System.out.println("Oyameles a sembrar: " + Math.round(numOyameles));
        System.out.println("Cedros a sembrar: " + Math.round(numCedros));
    }
    public static void main(String[] args) {
        calcularArboles(150);
    }
}