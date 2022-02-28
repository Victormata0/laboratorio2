/*
 * 
 */
package washingsimulator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @authors Merari Angélica Perdomo
 *          Victor Rafael Mata
 */
public class WashingSimulator {
    
    //Definición y inicialización de variables
    // Código realizado por Victor
    private int kilos=0, Llenado=0,typeClothe=0, completeWash=0, Secado=0;
    
    String ropa;
    //Definición de arreglos y listas
    //realizado por victor
    String tipoRopa[]={"ropa blanca", "ropa colorida", "jeans"};
    List<String> lista = new ArrayList<>(Arrays.asList(tipoRopa));
    int n=0;
    
    // Diferenciación entre las variables del método
    //Ayuda a buscar las variables que el usuario nos brinda con las de la clase
    //Código Realizado por Victor
    public WashingSimulator(int kilos, int tipoRopa)
    {
        this.kilos= kilos;
        this.typeClothe=tipoRopa;
        
    }
    Scanner sc=new Scanner(System.in);
    //Inicialización del método llenado
    //Este método ayuda a iniciar el ciclo del lavado
    //Código hecho por Merari
    private void Llenado()
    {
        if(kilos<=20)
        {
         completeWash=1;
         System.out.println("Llenando...");
         System.out.println("LLenado realizado");
        }else
        {
            System.out.println("Reduce la carga para comenzar el llenado");
        }
    }
    //Inicialización del método lavado
    //Este método inicializa el ciclo llamado lavado en el simulador
    //Código hecho por Merari
    private void Lavado()
    {
        Llenado();
        
        
        if(completeWash==1)
        {
            //Se cambio de if a switch, para tener más presentes los parametros a evaluar
            //Victor
            switch (typeClothe) {
                case 1: 
                    System.out.println("El tipo de ropa elegido es: "+ tipoRopa[0]);
                    System.out.println("Modo smooth activado");
                    System.out.println("Lavando...");
                    completeWash=1;
                break;

                case 2: 
                    System.out.println("El tipo de ropa elegido es: "+ tipoRopa[1]);
                    System.out.println("Modo potencia maxima activado");
                    System.out.println("Lavando...");
                    completeWash=1;
                break;
    
                case 3: 
                    System.out.println("El tipo de ropa elegido es: "+ tipoRopa[2]);
                    System.out.println("Modo centrifugado intensivo activado");
                    System.out.println("Lavando...");
                    completeWash=1; 
                break;
                //Realiza el ingreso de datos por medio de la variable x
                case 4:
                    System.out.println("Ingrese el tipo de ropa que desea usar: ");
                    String x= sc.nextLine();
                    System.out.println("Lista arreglo inicial: \n"+ lista);
                    
                    //Agg elementos
                    lista.add(x);
                    System.out.println("Lista arreglo modificada: \n"+ lista);
                    System.out.println("El tipo de ropa elegido es: "+ x);
                    System.out.println("Modo lavado rápido activado");
                    System.out.println("Lavando...");
                    completeWash=1; 
                break;
                //Elimina la variable de ropa en el arreglo
                //Merari
                case 5: 
                    System.out.println("Ingrese el tipo de ropa que desea eliminar: ");
                    String deleted= sc.nextLine();
                    lista.remove(deleted);
                    Iterator it = lista.iterator();
                    while(it.hasNext())
                        System.out.println(it.next());
                break;
                //Falla 
                //Realiza la busqueda secuencial de la variable deseada por el usuario
                //Merari
                case 6: 
                    String busqueda;
                    System.out.println("Ingrese el tipo de ropa que desea buscar");
                    busqueda=sc.nextLine();
                    
                    //Busqueda secuencial
                    int exito=0;
                    if(n<=0){
                    
                    System.out.println("Ingresa el tipo de ropa que deseas buscar : ");
                    ropa = sc.nextLine();
 
                    for(int i=0; i<n; i++){
                        if(tipoRopa[i].compareTo(ropa)==0){
                        exito=1;
                        }
                    }
                    if(exito==1){
                        System.out.println("Nombre encontrado. ");
                    }
                    else
                    {
                        System.out.println("Nombre NO localizado. ");
                        System.out.println("No hay elementos en la lista. ");
                    }break;
                    }
                break;
 
                default:
                    System.out.println("Escriba un valor valido");
                break;
            }
           
        }
    }
    
 
    //Inicialización de método secado 
    //Código hecho por Victor
    
    private void Secado()
    {
        Lavado();
        if(completeWash==1)
        {
            System.out.println("Comenzando secado...");
            System.out.println("Ciclo de secado terminado");
            Secado=1;
        }
    }
    //Inicialización de método finalizado del ciclo
    //Código hecho por Victor
    public void CicloFinal()
    {
        Secado();
        if(Secado==1)
        {
            System.out.println("El lavado ha finalizado");
        }
    }
    //Inicio de entradas get y set
    //Código hecho por Merari
    public int getTC()
    {
        return typeClothe;
    }
    public void setTC(int typeClothe)
    {
        this.typeClothe= typeClothe;
    }
}

