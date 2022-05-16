package washingsimulator;
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
    
// Métodos utilizados:
    ClienteHabitual(String nombre, String apellidos, String tipoCliente){
        super(nombre,apellidos,tipoCliente);  
//Llama al constuctor de la superclase, este método 
//se utiliza para mandar a traer los nombres y el tipo de cliente según corresponda
    }
//Sobreescritura del método imprimir. Sirve para imprimir los datos del cliente
    @Override
    public void imprimir() {
        System.out.println ("Datos del cliente. Nombre: " + getNombre() + " " + getApellidos() + " Tipo: "+getTipoCliente());  
    }
}