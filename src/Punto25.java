public class Punto25 {
    static void aumento(int sueldoBase) {
        if (sueldoBase < 40000) {
            int sueldoTotal = (int) (sueldoBase * 1.15);
            System.out.println("Como no supera los 40.000 Bs, su sueldo total es de: " + sueldoTotal);
        } else {
            int sueldoTotal = (int) (sueldoBase * 1.12);
            System.out.println("Como supera los 40.000 Bs, su sueldo total es de: " + sueldoTotal);
        }
    }
    public static void main(String[] args) {
        aumento(200000);
    }
}
