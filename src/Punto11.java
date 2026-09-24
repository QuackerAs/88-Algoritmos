public class Punto11 {
    static void saldo(float hNormales, float pHora, float hExtra, int nHijos){
        float pNormal = hNormales * pHora;
        float pExtra = (float) (hExtra * 1.25 * pHora);
        float sBase = pNormal + pExtra;
        float deducciones = (float) (0.14 * sBase);
        float asignaciones = 43000 + (17300 * nHijos);
        float sNeto = sBase + asignaciones - deducciones;
        System.out.printf("Asignaciones: " + asignaciones + " Bolívares\n");
        System.out.printf("Deducciones: " + deducciones + " Bolívares\n" );
        System.out.printf("Sueldo Neto: "+ sNeto +" Bolívares\n");

    }
    public static void main(String[] args) {
        saldo(40,2000,10,2);
    }
}
