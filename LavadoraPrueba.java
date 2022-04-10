
package washingsimulator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Iterator;
import java.util.Scanner;



public class LavadoraPrueba{
    static ArrayList<Persona> clientes=new ArrayList<Persona>();
    
    public static void main(String[] args) throws IOException{
        //Redefinimos el valor de Scanner, en este caso será con la variable sc
        //Hecho por Merari
        //String busqueda;
        Persona ch;
        ch= new ClienteNuevo();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Time t[]= new Time[3];
        clientes.add(new ClienteHabitual("Merari","Perdomo",ch.getTipoCliente()) );
        t[0]= new Time("30 min","smooth");
        t[1]= new Time("45 min", "potencia maxima");
        t[2]= new Time("1 hr", "centrifugado intensivo activado");
        Scanner sc=new Scanner(System.in);
        
        String tRopa[]={"ropa blanca", "ropa colorida", "jeans"};
        
        
        String detergente = null;
        
        int p=0;
        
        
        while(p<=0){
            
            conseguirDatos();
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
                    
//                    System.out.println("Clientes: \n");
//                    Comparador comparador = new Comparar();
//                    clientes.sort((Comparator<Persona>) comparador);
//                    clientes.sort((Comparator<Persona>) new Comparar());
//                    clientes.forEach(System.out::println);
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
    
    public static void conseguirDatos() throws IOException {
        Scanner sc=new Scanner(System.in);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Bienvenido al sistema de lavado virtual \n");
        System.out.print("Elija una opción: \n");
        System.out.print("1. Cliente habitual \n 2. Cliente Nuevo \n");
        int tipoCliente= sc.nextInt();
        if(tipoCliente==1){
            Persona ch = new ClienteHabitual();
            System.out.print("Introduzca su nombre: ");
            ch.setNombre(br.readLine());

            System.out.print("Introduzca su apellido: ");
            ch.setApellidos(br.readLine());
            ch.imprimir();
            clientes.add(new ClienteHabitual(ch.getNombre(),ch.getApellidos(),ch.getTipoCliente()));
            
        } else if(tipoCliente==2){
            Persona ch;
            ch= new ClienteNuevo();
            System.out.print("Introduzca su nombre: ");
            ch.setNombre(br.readLine());

            System.out.print("Introduzca su apellido: ");
            ch.setApellidos(br.readLine());
            ch.imprimir();
            clientes.add(new ClienteNuevo(ch.getNombre(),ch.getApellidos(),ch.getTipoCliente()));
//            Persona w[] = new Persona[j];
//            
//            w[0]= new ClienteHabitual (ch.getNombre(),ch.getApellidos(),ch.getTipoCliente());
            
          
        }
        
      
    }
}
        


    

