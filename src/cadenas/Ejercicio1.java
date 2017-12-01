
package cadenas;

import utilidades.Entrada;


public class Ejercicio1 {
    
    public static void main(String[] args) {
        
    String palabra;
    int posa,pose,posi,poso,posu;
    
    System.out.println("Introduzca una palabra y comprobaremos si es panvocálica (contiene las 5 vocales): ");
    palabra=Entrada.cadena();
    
    posa=palabra.toLowerCase().indexOf('a');
    pose=palabra.toLowerCase().indexOf('e');
    posi=palabra.toLowerCase().indexOf('i');
    poso=palabra.toLowerCase().indexOf('o');
    posu=palabra.toLowerCase().indexOf('u');
    
    if(posa>=0&&pose>=0&&posi>=0&&poso>=0&&posu>=0)
        System.out.println("La palabra "+palabra+" es panvocálica");
    else
        System.out.println("La palabra "+palabra+" no es panvocálica");
        
   
        
        
    }
  
}
