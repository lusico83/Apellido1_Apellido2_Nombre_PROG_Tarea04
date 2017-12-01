
package arrays;

public class Triangulo {
    
    private Punto verticeA;
    private Punto verticeB;
    private Punto verticeC;
    
    
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
    
    
}
