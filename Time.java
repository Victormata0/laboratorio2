package washingsimulator;
//Autor:@Merari A. Perdomo
class Time{
    private String tiempoLavado;
    private String tipoWash;
     public Time()
     {
         super();
     }
    public Time(String tiempo, String lavado) 
     {
         super();
         this.tiempoLavado = tiempo;
         this.tipoWash=lavado;
     }
    public String getTipoWash() {
        return tipoWash;
    }
    public void setTipoWash(String tipoWash) {
        this.tipoWash = tipoWash;
    }
    public String getTiempoLavado() {
        return tiempoLavado;
    }
    public void setTiempoLavado(String tiempoLavado) {
        this.tiempoLavado = tiempoLavado;
    }
    @Override
     public String toString() 
     {
         return "[ Modo de lavado: "+ tipoWash +" tiempo=" + tiempoLavado + " ]";
     }
}