
package proyecto11_MVC_Ejemplo1;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;


public class Proyecto11_MVC_Ejemplo1 {
    
    public static void main(String[] args) {
        
        Vista v1 = new Vista();
        Modelo m1 = new Modelo();
        
        Controlador c1 = new Controlador(m1,v1);
        c1.iniciarVista();
        
        
    }

}
