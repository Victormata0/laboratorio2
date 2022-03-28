
package washingsimulator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Iterator;
import java.util.Scanner;



public class LavadoraPrueba{
    
    public static void main(String[] args) throws IOException{
        //Redefinimos el valor de Scanner, en este caso será con la variable sc
        //Hecho por Merari
        //String busqueda;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Time t[]= new Time[3];
        t[0]= new Time("30 min","smooth");
        t[1]= new Time("45 min", "potencia maxima");
        t[2]= new Time("1 hr", "centrifugado intensivo activado");
        Scanner sc=new Scanner(System.in);
        
        String tRopa[]={"ropa blanca", "ropa colorida", "jeans"};
        
        
        String detergente = null;
        
        int p=0;
        Cliente c1=new Cliente();
        c1.iniciar();
        while(p<=0){
            System.out.println("****Bienvenido a tu confiable lavadora****");
            System.out.println("-------------------------");
            System.out.println("¿Qué acción deseas realizar hoy?");
            System.out.println("1. Lavado");
            System.out.println("2. Eliminar un tipo de ropa");
            System.out.println("3. Realizar una busqueda");
            System.out.println("4. Agregar un tipo de ropa");
            System.out.println("5. Salir");
            int process=sc.nextInt();
            switch(process){
                case 1 -> {
                    System.out.println("Has elegido la opción Lavado");
                    System.out.println("\tDetergente\t");
                    Detergente det=new Detergente(detergente);
                    det.arreglos();
                    
                    System.out.println("¿Qué tipo de ropa es?\n 1.ropa blanca \n 2.ropa de color \n 3. jeans \n opciones adicionales: \n 4.Agregar un tipo de ropa diferente");
                    int tipoRopa=sc.nextInt();
                    
                    System.out.println("¿Cuántos kg de ropa desea lavar? \n La cantidad máxima son 20kg");
                    int kilos=sc.nextInt();
                    WashingSimulator entradas= new WashingSimulator(kilos, tipoRopa, t);
                    entradas.CicloFinal();
                    System.out.println("El detergente usado fue: "+det.tipoDetergente);
                    break;
                }
                case 2 -> { 
                    System.out.println("\t Eliminar tipo de ropa \t");
                    int tipoRopa = 5;
                    int kilos = 0;
                    WashingSimulator n= new WashingSimulator(kilos, tipoRopa, t);
                    n.Lavado();
                    
                    break;
                    
                }
                
         
                case 3 -> { 
                    System.out.println("Ingrese el tipo de ropa que desea buscar:");
                    String buscar= br.readLine();
                    //Busqueda
                    int indiceDelElementoBuscado = busquedaBinaria(tRopa, buscar);
                    System.out.println("El elemento buscado (" +   buscar + ") se encuentra en el índice: " + indiceDelElementoBuscado);
                    break;
                }   
                case 4 -> { 
                    System.out.println("Siga las indicaciones antes de elegir su ropa: ");
                    System.out.println("");
                    System.out.println("Elige el tipo de detergente que deseas utilizar ");
                    Detergente d=new Detergente(detergente);
                    d.arreglos();
                    System.out.println("¿Cuántos kg de ropa desea lavar? \n La cantidad máxima son 20kg");
                    int kilos = sc.nextInt();
                    int tipoRopa = 4;
                    WashingSimulator e= new WashingSimulator(kilos, tipoRopa, t);
                    e.CicloFinal();
                    System.out.println("El detergente usado fue: "+d.tipoDetergente);
                    p=1;
                    break;
                }

                case 5 -> { 
                    System.out.println("¡Gracias por preferirnos!");
                    p=1;
                    break;
                }
                default -> {
                    System.out.println("Escriba un valor valido");
                    break;
                }
            }
            
        }
        
    }
    public static int busquedaBinaria(String[] tRopa, String busqueda)
        {
    
            int izquierda = 0, derecha = tRopa.length - 1;
 
            while (izquierda <= derecha) {
        // Calculamos las mitades...
                int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
                String elementoDelMedio = tRopa[indiceDelElementoDelMedio];
 
        
        // Primero vamos a comparar y ver si el resultado es negativo, positivo o 0
                int resultadoDeLaComparacion = busqueda.compareTo(elementoDelMedio);
 
        // Si el resultado de la comparación es 0, significa que ambos elementos son iguales
        // y por lo tanto quiere decir que hemos encontrado la búsqueda
                if (resultadoDeLaComparacion == 0) {
                    return indiceDelElementoDelMedio;
                }
 
        // Si no, entonces vemos si está a la izquierda o derecha
 
                if (resultadoDeLaComparacion < 0) {
                    derecha = indiceDelElementoDelMedio - 1;
                } else {
                    izquierda = indiceDelElementoDelMedio + 1;
                }
            }
    // Si no se rompió el ciclo ni se regresó el índice, entonces el elemento no
    // existe
        return -1;
    
    }
}


    

