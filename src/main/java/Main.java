
import Controlador.Controlador;
import Vista.Ventana;
import modelo.receta.Receta;
import modelo.red.Conexion;

public class Main {
    public static void main(String[] args) {
        /*try {
            Conexion.getInstance().logear("admin@gmail.com","123456");
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //Conexion.getInstance().agregarReceta(new Receta());
        Ventana v = new Ventana();
        Controlador c = new Controlador(v);
    }


}
