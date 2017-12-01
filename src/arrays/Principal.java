
package arrays;

import utilidades.Entrada;

public class Principal {
    
    public static void main(String[] args) {
        
        int numtriangulos;
        Punto vertice1, vertice2, vertice3;
        double media=0;
        
        do{
        System.out.println("Introduzca un numero de triangulos que desea crear: ");
        numtriangulos=Entrada.entero();
        }while(numtriangulos<1);
        
        Triangulo arraydetriangulos[]=new Triangulo[numtriangulos];
        
        for(int i=0;i<arraydetriangulos.length;i++){
            vertice1=new Punto((int)(Math.random()*100),(int)(Math.random()*100));
            vertice2=new Punto((int)(Math.random()*100),(int)(Math.random()*100));
            vertice3=new Punto((int)(Math.random()*100),(int)(Math.random()*100));
            
            arraydetriangulos[i]=new Triangulo(vertice1,vertice2,vertice3);
            
            
        }
        
        
        
        
        
    }
    
}
