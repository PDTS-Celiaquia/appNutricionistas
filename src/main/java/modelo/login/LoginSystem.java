package modelo.login;

import org.json.JSONException;
import org.json.JSONObject;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LoginSystem {
    private static LoginSystem instance = null;
    private String token;

    private LoginSystem() {
        token = null;
    }

    public static LoginSystem getLoginSystem() {
        if (instance == null) {
            instance = new LoginSystem();
        }
        return instance;
    }

    public void logear(String email, String password) throws Exception {
        OutputStream os;
        HttpsURLConnection conexion = null;
        String mensaje = "";
        JSONObject salida = new JSONObject();
        try {
            salida.put("email", email);
            salida.put("password", password);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        int codigo = -1;
        try {
            conexion = new Conexion().conectar("login");
            os = conexion.getOutputStream();
            os.write(salida.toString().getBytes("UTF-8"));
            os.close();
            codigo = conexion.getResponseCode();

            InputStream inputStream = conexion.getInputStream();
            int actual = inputStream.read();
            while (actual != -1) {
                mensaje += (char) actual;
                actual = inputStream.read();
            }

            token = mensaje.split("\"")[3];
            System.out.println(codigo); //TODO Borrar despues, solo para debug
            System.out.println(mensaje);
            System.out.println(token);
        } catch (IOException e) {
            throw new Exception();
        }
    }
}



