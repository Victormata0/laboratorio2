/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package washingsimulator;


/**
 *
 * @author Merari Angélica
 */
public class Comparar implements Comparador {

    @Override
    public int comparar(Object o1, Object o2) {
        Persona p1=(Persona)o1;
        Persona p2=(Persona)o2;
        
        return p1.getNombre().compareTo(p2.getNombre());
            
        }
        
    }

    
    

