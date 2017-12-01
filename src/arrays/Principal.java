
package arrays;

import utilidades.Entrada;

public class Principal {
    
    public static void main(String[] args) {
        
        int numtriangulos,mayormedia=0,menormedia=0,triangulomayor=0,triangulomenor=0;
        Punto vertice1, vertice2, vertice3;
        double perimetromedio=0,suma=0;
        
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
            suma=suma+arraydetriangulos[i].perimetro(vertice1, vertice2, vertice3);
            
        }
        perimetromedio=suma/numtriangulos;
        System.out.println("La media de los perimetros de los "+numtriangulos+" triangulos es "+(perimetromedio)+("."));
        
        for(int i=0;i<arraydetriangulos.length;i++){
            
            if(perimetromedio>=(arraydetriangulos[i].perimetro(arraydetriangulos[i].getVerticea(),arraydetriangulos[i].getVerticeb(),arraydetriangulos[i].getVerticec()))){
                menormedia ++;
                triangulomenor=i;}
            else{
                mayormedia ++;
                triangulomayor=i;}
            
        }
        
        System.out.println("Hay "+mayormedia+" triangulos con perimetros mayores o iguales a la media, y entre ellos el mayor es el triangulo "+triangulomayor+" con coordenadas "+arraydetriangulos[triangulomayor].toString());
        System.out.println("Hay "+menormedia+" triangulos con perimetros menores a la media, y entre ellos el menor es el triangulo "+triangulomenor+" con coordenadas "+arraydetriangulos[triangulomenor].toString());
    }
    
}
