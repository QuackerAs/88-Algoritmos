public class Punto10 {
    static void conversor(float chelines, float dracmas, float pesetas){
         float chelinesPesetas = (float) (chelines * (956.871 / 100.0));
         float dracmasFrancos = (float) ((dracmas * (88.607 / 100.0)) / 20.110);
         float pesetasDolares = (float) (pesetas / 122.499);
         float pesetasLiras = (float) (pesetas * (100.0 / 9.289));
        System.out.println("El cambio de " + chelines + " Chelines a Pesetas es de: " + chelinesPesetas + " Pesetas");
        System.out.println("El cambio de " + dracmas + " Dracmas Griegos a francos franceses es de: " + dracmasFrancos + " Francos franceses");
        System.out.println("El cambio de " + pesetas + " Pesetas a Dolares Estadounidenses es de: " + pesetasDolares + " Dolares");
        System.out.println("El cambio de " + pesetas + " Pesetas a Liras Italianas es de: " + pesetasLiras + " Liras italianas");
    }
    public static void main(String[] args) {
        conversor(100,100,100);
    }
}