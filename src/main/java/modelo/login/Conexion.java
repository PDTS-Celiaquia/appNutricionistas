package modelo.login;


import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Conexion {

    public HttpsURLConnection conectar(String ruta) {

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