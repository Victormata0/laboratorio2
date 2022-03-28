
package washingsimulator;

import java.util.Scanner;

/**
 *
 * @author Merari Angélica
 */
public class Cliente implements InterfaceLavadora {
    String cliente;
    @Override
    public void iniciar() {
        System.out.println("Ingrese el nombre del cliente: ");
        Scanner sc=new Scanner(System.in);
        cliente=sc.nextLine();
    }
    
}
