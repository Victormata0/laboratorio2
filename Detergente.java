
package washingsimulator;

import java.util.Scanner;

import java.util.Arrays;

public class Detergente {
    //Inicialización de variables y arreglos
    //Victor
   String tipoDetergente;
   public Detergente(String detergente){
        this.tipoDetergente=detergente;
    }
    Scanner sc=new Scanner(System.in);
    
    String det[];
    int cantidadArreglo;
   //Merari 
   public void arreglos()
   {
       arreglo_detergente();
        System.out.println("Arreglo desordenado: " + Arrays.toString(det));
        burbuja(det);
        System.out.println("Arreglo ordenado: "+ Arrays.toString(det)); 
        tipoDetergente=Arrays.toString(det);
        
       
   }
     private static void burbuja(String[] det) {
         
        for (int x = 0; x < det.length; x++) {
            for (int y = 0; y < det.length - 1; y++) {
                String elementoActual = det[y],
                        elementoSiguiente = det[y + 1];
                if (elementoActual.compareTo(elementoSiguiente) > 0) {
                    // Intercambio
                    det[y] = elementoSiguiente;
                    det[y + 1] = elementoActual;
                }
            }
        }
    }
     //Definimos el método para guardar el arreglo de detergente
     //victor
   public void arreglo_detergente()
    {
        System.out.println("Dígite la cantidad de tipos detergente que desea añadir a su lista: ");
        cantidadArreglo= sc.nextInt();
        det= new String [cantidadArreglo];
        
        for (int i=0; i<cantidadArreglo;i++)
        {
            System.out.println("Dígite el tipo de detergente que usará: ");
            det[i]=sc.next();
        }
    }
    
}
