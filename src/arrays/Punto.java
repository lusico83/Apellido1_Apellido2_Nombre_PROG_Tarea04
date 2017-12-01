
package arrays;


public class Punto {
    
    private int x, y;
    
    //Constructor de la clase Punto
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    //Metodos get
     public int getX(){
        return x;   
    }
    public int getY(){
        return y;
    }
    
    //Metodo toString
    public String toString(){
        return("("+x+","+y+")");
    }
}