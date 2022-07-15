import modelo.login.LoginSystem;

public class Main {
    public static void main(String[] args) {
        try {
            LoginSystem.getLoginSystem().logear("admin@gmail.com","123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
