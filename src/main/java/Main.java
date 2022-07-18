import modelo.login.Conexion;

public class Main {
    public static void main(String[] args) {
        try {
            Conexion.getInstance().logear("admin@gmail.com","123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
