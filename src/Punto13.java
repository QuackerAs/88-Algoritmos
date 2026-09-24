public class Punto13 {
    static void totalDinero(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8){
        int total = (n1*50000)+(n2*20000)+(n3*10000)+(n4*5000)+(n5*2000)+(n6*1000)+(n7*500)+(n8*100);
        System.out.println("La cantidad de dinero total dentro del banco es de: " + total);
    }
    public static void main(String[] args) {
        totalDinero(15,40,25,60,100,50,200,150);
    }
}
