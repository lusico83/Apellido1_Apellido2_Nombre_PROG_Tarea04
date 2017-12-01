
package arrays;

public class Triangulo {
    
    private Punto verticeA;
    private Punto verticeB;
    private Punto verticeC;
    private String puntos;
    private double perimetro;
    
    
    public Triangulo(Punto verticeA, Punto verticeB, Punto verticeC){
        
        this.verticeA=verticeA;
        this.verticeB=verticeB;
        this.verticeC=verticeC;
        
    }
    
    public Punto getVerticea(){
        return verticeA;
    }
    
    public Punto getVerticeb(){
        return verticeB;
    }
    
    public Punto getVerticec(){
        return verticeC;
    }
    
    public String toString(){
        puntos=("A("+verticeA.getX()+","+verticeA.getY()+"),B("+verticeB.getX()+","+verticeB.getY()+"),C("+verticeC.getX()+","+verticeC.getY()+")");
        return puntos;
    }
    
    public double perimetro(Punto verticeA, Punto verticeB, Punto vertice3){
    perimetro=((verticeA.distancia(verticeA.getX(), verticeB.getX(), verticeA.getY(), verticeB.getY()))+(verticeA.distancia(verticeA.getX(), verticeC.getX(), verticeA.getY(), verticeC.getY()))+(verticeA.distancia(verticeC.getX(), verticeB.getX(), verticeC.getY(), verticeB.getY())));
    return perimetro;
    }
    
}
