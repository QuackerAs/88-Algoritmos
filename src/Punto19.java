public class Punto19 {
    static void hospital(double montoTotal){
        double montoG = montoTotal * 0.40;
        double montoT = montoTotal * 0.30;
        double montoP = montoTotal * 0.30;
        System.out.println("El monto que le corresponde a ginecologia es de: " + montoG);
        System.out.println("El monto que le corresponde a traumatologia es de: " + montoT);
        System.out.println("El monto que le corresponde a pediatria es de: " + montoP);
    }
    public static void main(String[] args){
        hospital(3000000);
    }
}
