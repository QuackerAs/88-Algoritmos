public class Punto18 {
    static void conversor(double galon){
        double galonLitros = galon * 3.785;
        double valorTotal = galonLitros * 100;
        System.out.println("Se cobra un total de " + valorTotal +  " Bolivares");
    }
    public static void main(String[] args){
        conversor(20);
    }
}
