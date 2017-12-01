
package arrays;

public class Triangulo {
    
    private Punto verticeA;
    private Punto verticeB;
    private Punto verticeC;
    private String puntos;
    
    
    public Triangulo(Punto verticeA, Punto verticeB, Punto verticeC){
        
        this.verticeA=verticeA;
        this.verticeB=verticeB;
        this.verticeC=verticeC;
        
    }
    
    public Punto getVerticeA(){
        return verticeA;
    }
    
    public Punto getVerticeb(){
        return verticeB;
    }
    
    public Punto getVerticeC(){
        return verticeC;
    }
    
    public String toString(){
        puntos=("A("+verticeA.getX()+","+verticeA.getY()+"),B("+verticeB.getX()+","+verticeB.getY()+"),C("+verticeC.getX()+","+verticeC.getY()+")");
        return puntos;
    }
    
    
}
