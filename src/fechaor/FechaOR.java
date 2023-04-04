package fechaor;

import java.util.Scanner;

public class FechaOR {

    public static void main(String[] args) {
        //Lee la entrada del usuario y lo almacena en la variable consola
        //instanciar la clase con el '= new ...' 
        Scanner consola = new Scanner(System.in); 
        
        int dia, mes, year;

        System.out.println("Introduzca un día");
        dia = consola.nextInt();  
        
        System.out.println("Introduzca un número de mes");
        mes = consola.nextInt(); 
        
        System.out.println("Introduzca un año");
        year = consola.nextInt(); 
        
        if(mes == 1 || mes == 2 || mes == 3){
             System.out.println("La fecha corresponde al primer trimeste del año. " + "Día: " + dia + ", mes: " + mes + ", año: " + year + ".");
        }else{
            System.out.println("La fecha NO corresponde al primer trimeste del año");
        }
    }
    
}
