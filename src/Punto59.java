public class Punto59 {
    static void estadisticasAlumnos(int numAlumnos) {
        double menorProg = 6.0; // asumiendo nota base sobre 5.0
        int noIngles = 0, siIngles = 0;
        int aprobaronTodas = 0;
        double sumaProg = 0;
        int reprobaronMat = 0;

        for (int i = 0; i < numAlumnos; i++) {
            double notaMat = Math.random() * 5.0;
            double notaProg = Math.random() * 5.0;
            double notaIng = Math.random() > 0.2 ? Math.random() * 5.0 : -1.0;

            if (notaProg < menorProg) menorProg = notaProg;
            sumaProg += notaProg;

            if (notaMat < 3.0) reprobaronMat++;

            if (notaIng == -1.0) noIngles++;
            else siIngles++;

            if (notaMat >= 3.0 && notaProg >= 3.0 && notaIng >= 3.0) {
                aprobaronTodas++;
            }
        }

        System.out.printf("a. Nota menor en Programación: %.2f\n", menorProg);
        double porcNoIngles = siIngles > 0 ? ((double) noIngles / siIngles) * 100 : 0;
        System.out.printf("b. Porc. no presentaron vs si presentaron inglés: %.2f%%\n", porcNoIngles);
        System.out.println("c. Alumnos que aprobaron todas: " + aprobaronTodas);
        System.out.printf("d. Promedio general en Programación: %.2f\n", (numAlumnos > 0 ? sumaProg / numAlumnos : 0));
        double porcMat = numAlumnos > 0 ? ((double) reprobaronMat / numAlumnos) * 100 : 0;
        System.out.printf("e. Porc. reprobaron Matemática: %.2f%%\n", porcMat);
    }
    public static void main(String[] args) {
        estadisticasAlumnos(30);
    }
}