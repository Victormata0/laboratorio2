/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package washingsimulator;

/**
 *
 * @author Merari Angélica
 */
public class ClienteNuevo extends Persona  {
    // Constructores

    public ClienteNuevo () {
        super();
        setTipoCliente("Cliente Nuevo");
    } 
    // Métodos
    ClienteNuevo(String nombre, String apellidos, String tipoCliente){
        super(nombre,apellidos,tipoCliente);  //Llama al constuctor de la superclase
    }
    
    
    public void imprimir() {
        System.out.println ("Datos del cliente. Nombre: " + getNombre() + " " + getApellidos() + " Tipo: "+getTipoCliente());  
    }
    

    
}
    
