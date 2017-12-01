
package arrays;


public class Punto {
    
    //Me he dado cuenta tarde de que debían ser doubles
    private double x, y, distancia;
    
    //Constructor de la clase Punto
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    //Metodos get
     public double getX(){
        return x;   
    }
    public double getY(){
        return y;
    }
    
    //Metodo toString
    public String toString(){
        return("("+x+","+y+")");
    }
    
    public double distancia(double x1, double x2, double y1, double y2){
        distancia=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return distancia;
    }
}