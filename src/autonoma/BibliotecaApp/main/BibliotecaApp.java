
package autonoma.BibliotecaApp.main;

import autonoma.BibliotecaApp.models.Biblioteca;
import autonoma.BibliotecaApp.models.Libro;
import autonoma.BibliotecaApp.views.VentanaPrincipal;

/**
 *
 * @author Dsoch
 */
public class BibliotecaApp {
       public static void main(String[] args) {
       
        Biblioteca biblioteca = new Biblioteca();
        VentanaPrincipal ventana = new VentanaPrincipal(biblioteca);
        ventana.setVisible(true);


        
    }
    
}
