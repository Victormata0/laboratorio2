
package washingsimulator;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Merari Angélica
 */
public class ArrayListR {
    Scanner sc=new Scanner(System.in); 
    ArrayList<ListRopa> ropa=new ArrayList();
    
    
    public void addRopa(){
       String tipo=sc.nextLine();
       
       ListRopa r = new ListRopa();
       
       r.setRopa(tipo);
       
       ropa.add(r);
        
    }
    public void RemoveRopa(){
       String tipoR=sc.nextLine();
       
       ListRopa r=new ListRopa();
       
       r.setRopa(tipoR);
       
       ropa.remove(r);
        
    }
    public void getRopa(){
        String string="";
        for (int i=0; i<ropa.size(); i++){
           string += "Ropa"+(i+1)+ "\n";
           string += "Tipo: "+ropa.get(i).getRopa();
        }
        JOptionPane.showMessageDialog(null, string);
    } 
    
    public void limpiar(){
        ropa.clear();
    }
}
