
package washingsimulator;

import java.util.Scanner;

/**
 *
 * @author Merari Angélica
 */
public class ClienteHabitual extends Persona {
    // Constructores

    public ClienteHabitual () {
        super();
        setTipoCliente("Cliente Habitual");
    } 
    // Métodos
    ClienteHabitual(String nombre, String apellidos, String tipoCliente){
        super(nombre,apellidos,tipoCliente);  //Llama al constuctor de la superclase
    }
    
   
    @Override
    public void imprimir() {
        System.out.println ("Datos del cliente. Nombre: " + getNombre() + " " + getApellidos() + " Tipo: "+getTipoCliente());  
    }
    

    
} //Cierre de la clase
    
