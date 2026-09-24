public class Punto53 {
    static void calcularNomina(int m) {
        double totalGeneral = 0;
        int totalV1 = 0, totalV2 = 0, totalV3 = 0;
        int extraEdadImpar = 0;
        int sumaEdades = 0;

        for (int i = 0; i < m; i++) {
            char nacionalidad = Math.random() > 0.5 ? 'V' : 'E';
            int edad = 18 + (int) (Math.random() * 40);
            int tipo = 1 + (int) (Math.random() * 3);
            int horas = 40;

            double tarifa = 0;
            if (tipo == 1) tarifa = 5000;
            else if (tipo == 2) tarifa = 10000;
            else if (tipo == 3) tarifa = 15000;

            double sBase = horas * tarifa;
            double ss = (sBase > 100000) ? sBase * 0.03 : 0;
            double sNeto = sBase - ss;
            totalGeneral += sNeto;
            sumaEdades += edad;

            if (nacionalidad == 'V') {
                if (tipo == 1) totalV1++;
                else if (tipo == 2) totalV2++;
                else if (tipo == 3) totalV3++;
            } else if (nacionalidad == 'E' && (edad % 2 != 0)) {
                extraEdadImpar++;
            }
        }

        System.out.println("Total venezolanos Tipo 1: " + totalV1);
        System.out.println("Total venezolanos Tipo 2: " + totalV2);
        System.out.println("Total venezolanos Tipo 3: " + totalV3);
        System.out.println("Extranjeros con edad impar: " + extraEdadImpar);
        System.out.println("Promedio de edad general: " + (m > 0 ? sumaEdades / m : 0));
        System.out.println("Total general a pagar: " + totalGeneral + " Bs");
    }
    public static void main(String[] args) {
        calcularNomina(10);
    }
}