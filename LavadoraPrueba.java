
package washingsimulator;

import java.util.Scanner;

public class LavadoraPrueba {
    public static void main(String[] args){
        //Redefinimos el valor de Scanner, en este caso será con la variable sc
        //Hecho por Merari
        Scanner sc=new Scanner(System.in);
        String detergente = null;
        
        Detergente det=new Detergente(detergente);
        det.arreglos();
        
        System.out.println("¿Cuántos kg de ropa desea lavar? \n La cantidad máxima son 20kg");
        int kilos=sc.nextInt();
        
        //Hace una pregunta al usuario, para que consecuentemente
        //reciba un valor de entrada
        //Hecho por Victor 
        System.out.println("¿Qué tipo de ropa es?\n 1.ropa blanca \n 2.ropa de color \n 3. jeans \n opciones adicionales: \n 4.Agregar un tipo de ropa diferente \n 5. Eliminar un tipo de ropa predefinido \n 6. Buscar un tipo de ropa");
        int tipoRopa=sc.nextInt();
        
        // Manda a llamar la clase en donde se encuentra el código principal
        //Hecho por Merari
        WashingSimulator entradas= new WashingSimulator(kilos, tipoRopa);
        
        //Ayuda a establecer un valor por default el valor por default usando get y set
        //Hecho Merari 
        //entradas.setTC(2);
        //System.out.println("El tipo de ropa es "+ entradas.getTC());
        
        //Manda a llamar al ciclo final
        //Hecho por Merari
        entradas.CicloFinal();
        System.out.println("El detergente usado fue: "+det.tipoDetergente);
    }
    
}
