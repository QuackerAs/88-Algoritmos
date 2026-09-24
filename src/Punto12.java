public class Punto12 {
    static void promedioGeneral(double tMat1, double tMat2, double tMat3, double tFi1, double tFi2,double tQui1, double tQui2, double tQui3, double eMat, double eFi, double eQui){
        double pMat = (0.90*eMat) + 0.10 * ((tMat1+tMat2+tMat3)/3);
        double pFi = (0.80 * eFi) + 0.20 * ((tFi1+tFi2)/2);
        double pQui = (0.85 * eQui) + 0.15 * ((tQui1+tQui2+tQui3)/3);
        double pGen = (pFi+pQui+pMat)/3;
        System.out.printf("Promedio Matemática: %.2f\n", pMat);
        System.out.printf("Promedio Física: %.2f\n", pFi);
        System.out.printf("Promedio Química: %.2f\n", pQui);
        System.out.printf("Promedio General: %.2f\n", pGen);
    }
    public static void main(String[] args) {
        promedioGeneral(4.0, 3.8, 4.2,3.0, 4.8,4.5, 4.0, 5.0,3.5,4.2,2.8);
    }
}
