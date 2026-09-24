public class Punto28 {
    static void refacciones(int montoTotal){
        double creditoFabricante;
        if (montoTotal > 500000) {
            int inversion = (int) (montoTotal * 0.55);
            double banco  = montoTotal * 0.30;
            creditoFabricante = montoTotal * 0.15;
            System.out.println("Inversion de fondos propios: " + inversion);
            System.out.println("Prestamo del banco: " + banco);
            System.out.println("Credito al fabricante: " + creditoFabricante);
        } else {
            int inversion = (int) (montoTotal * 0.70);
            int banco  = 0;
            creditoFabricante = montoTotal * 0.30;
            System.out.println("Inversion de fondos propios: " + inversion);
            System.out.println("Prestamo del banco: " + banco);
            System.out.println("Credito al fabricante: " + creditoFabricante);;
        }

        double interes = creditoFabricante*0.20;
        System.out.println("Concepto de intereses: " + interes);

    }
    public static void main(String[] args) {
        refacciones(499999);
    }
}
