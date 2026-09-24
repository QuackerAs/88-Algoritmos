public class Punto52 {
    static void muestreoPesos() {
        double sumaN = 0, sumaJ = 0, sumaA = 0, sumaV = 0;
        int contN = 0, contJ = 0, contA = 0, contV = 0;

        for (int i = 0; i < 100; i++) {
            int edad = (int) (Math.random() * 80);
            double peso = 30.0 + (Math.random() * 50);

            if (edad >= 0 && edad <= 12) {
                sumaN += peso;
                contN++;
            } else if (edad >= 13 && edad <= 29) {
                sumaJ += peso;
                contJ++;
            } else if (edad >= 30 && edad <= 59) {
                sumaA += peso;
                contA++;
            } else if (edad >= 60) {
                sumaV += peso;
                contV++;
            }
        }

        System.out.printf("Promedio Niños: %.2f\n", (contN > 0 ? sumaN / contN : 0));
        System.out.printf("Promedio Jóvenes: %.2f\n", (contJ > 0 ? sumaJ / contJ : 0));
        System.out.printf("Promedio Adultos: %.2f\n", (contA > 0 ? sumaA / contA : 0));
        System.out.printf("Promedio Viejos: %.2f\n", (contV > 0 ? sumaV / contV : 0));
    }
    public static void main(String[] args) {
        muestreoPesos();
    }
}