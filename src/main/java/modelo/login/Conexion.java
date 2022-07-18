package modelo.login;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Conexion {

    private static Conexion instance = null;
    private String token;

    private Conexion(){
        this.token = null;
    }

    public static Conexion getInstance(){
        if(instance == null)
            instance = new Conexion();
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
            conexion = this.conectar("login");
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

            this.token = mensaje.split("\"")[3];
            System.out.println(codigo); //TODO Borrar despues, solo para debug
            System.out.println(mensaje);
            System.out.println(token);
        } catch (IOException e) {
            throw new Exception();
        }
    }

    private HttpsURLConnection conectar(String ruta) {

        HttpsURLConnection hpCon = null;

        try {
            URL hp = new URL("https://springceliaquia.herokuapp.com/api/usuario/" + ruta);

            hpCon = (HttpsURLConnection) hp.openConnection();

            hpCon.setConnectTimeout(5000);
            hpCon.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            hpCon.setDoOutput(true);
            hpCon.setDoInput(true);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return hpCon;
    }
}