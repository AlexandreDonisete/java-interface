package uscs;

public class Quadrado implements FormaGeometrica {
    private double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
     public double area() {
        return Math.pow(this.lado, 2);
    }
   
    public double comprimento() {
        return this.lado * 4; 
    }
}
