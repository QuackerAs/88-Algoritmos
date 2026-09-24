public class Punto54 {
    static void procesarCuestionarios() {
        double sumaCuestionarios = 0;
        double maxProm = -1; int instMax = 0;
        double minProm = 6; int instMin = 0;
        int contMenor3 = 0, contMayor4 = 0, cont45a5 = 0;

        for (int i = 1; i <= 64; i++) {
            double pt = 0;
            for (int j = 0; j < 23; j++) {
                pt += 1 + (int) (Math.random() * 5);
            }
            double prom = pt / 23.0;
            sumaCuestionarios += prom;

            if (prom > maxProm) { maxProm = prom; instMax = i; }
            if (prom < minProm) { minProm = prom; instMin = i; }

            if (prom < 3) contMenor3++;
            else if (prom > 4) contMayor4++;

            if (prom >= 4.5 && prom <= 5.0) cont45a5++;
        }

        System.out.printf("Promedio general: %.2f\n", (sumaCuestionarios / 64));
        System.out.printf("Mayor promedio: %.2f (Inst. %d)\n", maxProm, instMax);
        System.out.printf("Menor promedio: %.2f (Inst. %d)\n", minProm, instMin);

        double porcRelativo = contMayor4 > 0 ? ((double) contMenor3 / contMayor4) * 100 : 0;
        System.out.printf("Porc. < 3 respecto a > 4: %.2f%%\n", porcRelativo);

        double porcAbsoluto = ((double) cont45a5 / 64) * 100;
        System.out.printf("Porc. entre 4.5 y 5 respecto al total: %.2f%%\n", porcAbsoluto);
    }
    public static void main(String[] args) {
        procesarCuestionarios();
    }
}