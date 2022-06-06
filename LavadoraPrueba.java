package washingsimulator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LavadoraPrueba{
    static ArrayList<Persona> clientes=new ArrayList<>();
    public static void main(String[] args) throws IOException{
        //Definición de variables y arreglos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        String detergente = null;
        int p=0;
        Time t[]= new Time[3];
        String tRopa[]={"ropa blanca", "ropa colorida", "jeans"};
        
        
        //Arreglos para los tipos de lavado
        t[0]= new Time("30 min","smooth");
        t[1]= new Time("45 min", "potencia maxima");
        t[2]= new Time("1 hr", "centrifugado intensivo activado");
        
        while(p<=0){
            try{
                conseguirDatos();
                System.out.println("****Bienvenido a tu confiable lavadora****");
                System.out.println("-------------------------");
                System.out.println("¿Qué acción deseas realizar hoy?");
                System.out.println("1. Lavado");
                System.out.println("2. Eliminar un tipo de ropa");
                System.out.println("3. Realizar una busqueda");
                System.out.println("4. Agregar un tipo de ropa");
                //System.out.println("5. Mostrar los tipos de lavado que hay");
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
                        System.exit(0);
                    break;
                    }
                    default -> {
                        System.out.println("Escriba un valor valido");
                        System.exit(0);
                        break;
                    }

                }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "¡Error!"+ e, "Fallo del sistema", JOptionPane.OK_OPTION);
        }finally{
            JOptionPane.showMessageDialog(null, "El programa finalizo correctamente.");
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
        return -1;
    } 
    
    public static void conseguirDatos() throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Bienvenido al sistema de lavado virtual \n");
            System.out.print("Elija una opción: \n");
            System.out.print("1. Cliente habitual \n 2. Cliente Nuevo \n");
            int tipoCliente= sc.nextInt();
                switch (tipoCliente) {
                    case 1 ->                     {
                            Persona ch = new ClienteHabitual();
                            System.out.print("Introduzca su nombre: ");
                            ch.setNombre(br.readLine());
                            System.out.print("Introduzca su apellido: ");
                            ch.setApellidos(br.readLine());
                            ch.imprimir();
                            clientes.add(new ClienteHabitual(ch.getNombre(),ch.getApellidos(),ch.getTipoCliente()));
                        }
                    case 2 ->                     {
                            Persona ch= new ClienteNuevo();
                            System.out.print("Introduzca su nombre: ");
                            ch.setNombre(br.readLine());
                            System.out.print("Introduzca su apellido: ");
                            ch.setApellidos(br.readLine());
                            ch.imprimir();
                            clientes.add(new ClienteNuevo(ch.getNombre(),ch.getApellidos(),ch.getTipoCliente()));
                        }
                    default ->{
                            System.out.println("Ingrese un valor valido");
                            LavadoraPrueba.main(null);
                    }
                } 
    }
}