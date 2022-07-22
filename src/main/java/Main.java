
import Controlador.Controlador;
import Vista.IVista;
import Vista.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        /*try {
            Conexion.getInstance().logear("admin@gmail.com","123456");
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //Conexion.getInstance().agregarReceta(new Receta());
        IVista v = new VentanaPrincipal();
        Controlador c = new Controlador(v);
    }


}
