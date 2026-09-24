public class Punto3 {
    static void calculos(double v1, double v2, double v3, double sueldoBase){
        double comision = (v1+v2+v3)*0.10;
        double total = sueldoBase+comision;
        System.out.println("La comision generada es de: " + comision);
        System.out.println("El total de tu salario mas la comision da: " + total);
    }
    public static void main(String[] args) {
        calculos(12000,30000,40000,1750000);
    }
}