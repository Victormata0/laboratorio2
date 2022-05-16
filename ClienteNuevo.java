package washingsimulator;
//@Autor: Merari A. Perdomo

public class ClienteNuevo extends Persona  {
    // Constructores
    public ClienteNuevo () {
        super();
        setTipoCliente("Cliente Nuevo");
    } 
    // Métodos usados
    //Llama al constuctor de la superclase, este método 
    //se utiliza para mandar a traer los nombres y el tipo de cliente según corresponda
    ClienteNuevo(String nombre, String apellidos, String tipoCliente){
        super(nombre,apellidos,tipoCliente);  //Llama al constuctor de la superclase
    }
    //Método sobreescrito usado para imprimir datos
    @Override
    public void imprimir() {
        System.out.println ("Datos del cliente. Nombre: " + getNombre() + " " + getApellidos() + " Tipo: "+getTipoCliente());  
    }
}
    
