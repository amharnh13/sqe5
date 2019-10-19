package simpleant;
public class HelloWorld {
    public static int perkalian(int x, int y){
        return x*y;
    }
    public static void main(String[] args) {
        int a, b;
        a = 20;
        b = 150;
        System.out.println("Hasil Perkalian dari "+a+" dan "+b+" adalah "+perkalian(a,b));
}
}