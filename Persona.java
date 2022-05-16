package washingsimulator;
public abstract class Persona {
    private String nombre; 
    private String apellidos;
    private String tipoCliente;
    public Persona() { 
        
    }
    Persona (String nombre, String apellidos, String tipoCliente) { 
        this.nombre = nombre; 
        this.apellidos = apellidos;
        this.tipoCliente= tipoCliente;
    }
    public String getTipoCliente() {
        return tipoCliente;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public abstract void imprimir();
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public String getNombre() { 
        return nombre;  
    }
    public String getApellidos() { 
        return apellidos;  
    }
}


    

