
package cadenas;

import utilidades.Entrada;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Pattern matricula=Pattern.compile("(^\\d{4}([B-D]|[F-H]|[J-N]|[P-T]|[V-Z]){3}$)");
        Matcher comprobarmatricula;
        String mat;
        
        System.out.println("Introduzca una matricula válida: ");
        mat=Entrada.cadena();
        
        comprobarmatricula=matricula.matcher(mat.toUpperCase());
        
        if(comprobarmatricula.matches())
            System.out.println("La matricula número "+mat.substring(0, 4)+" letra "+mat.substring(4,7)+" es válida. ");
        else
            System.out.println("La matricula número "+mat.substring(0, 4)+" letra "+mat.substring(4,7)+" no es válida. ");
        
        
        
        
    }
    
}
