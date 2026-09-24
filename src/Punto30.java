public class Punto30 {
    static void redondear(int a, int b, int c, int d){
        int n = (a*1000)+(b*100)+(c*10)+d;
        double residuo = n % 100;
        int redondeado;
        if (residuo >= 50){
            redondeado = (int) (n + (100-residuo));
        } else {
            redondeado = (int) (n -residuo);
        }
        System.out.println(redondeado);
    }
    public static void main(String[] args) {
        redondear(2, 3,4,2);
    }
}
