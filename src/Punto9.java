public class Punto9 {
    static void salarioNeto(int horas,  double valorHora){
        double sBase = horas * valorHora;
        double total = 0.80 * sBase;
        System.out.println("Su salario neto calculado es de: " + total);
    }
        public static void main(String[] args) {
            salarioNeto( 504,8300);
    }
}
