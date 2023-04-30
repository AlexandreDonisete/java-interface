package uscs;

public class TestaForma {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(2);
        
        System.out.println(circulo.area());
        System.out.println(circulo.comprimento());
        
        System.out.println(" ");
        
        
        System.out.println(quadrado.area());
        System.out.println(quadrado.comprimento());
    }
    
}
