package washingsimulator;
public class Comparar implements Comparador {
    //Compara un objeto de tipo Time con otro objeto del mismo tipo
    @Override
    public int compare(Time t1, Time t2) {
        return t1.getTipoWash().compareTo(t2.getTipoWash());
        }
    
    }