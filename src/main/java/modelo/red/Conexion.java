package modelo.red;


import modelo.receta.Receta;
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
            conexion = this.conectar("usuario/login",false);
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

    public void agregarReceta(Receta receta){
        OutputStream os;
        JSONObject salida = new JSONObject();
        HttpsURLConnection conexion = null;
        try {
            salida.put("acidos_grasos_monoinsaturados", receta.getAcidos_grasos_monoinsaturados());
            salida.put("acidos_grasos_poliinsaturados", receta.getAcidos_grasos_poliinsaturados());
            salida.put("acidos_grasos_saturados", receta.getAcidos_grasos_saturados());
            salida.put("agua", receta.getAgua());
            salida.put("calcio", receta.getCalcio());
            salida.put("cantidad_alimentos_accesibles", receta.getCantidad_alimentos_accesibles());
            salida.put("cantidad_alimentos_no_accesibles", receta.getCantidad_alimentos_no_accesibles());
            salida.put("cantidad_platos", receta.getCantidad_platos());
            salida.put("carbohidratos_disponibles", receta.getCarbohidratos_disponibles());
            salida.put("carbohidratos_total", receta.getCarbohidratos_total());
            salida.put("ceniza", receta.getCeniza());
            salida.put("colesterol", receta.getColesterol());
            salida.put("descripcion", receta.getDescripcion());
            salida.put("energia_kj", receta.getEnergia_kj());
            salida.put("fibra_dietetica", receta.getFibra_dietetica());
            salida.put("fosforo", receta.getFosforo());
            salida.put("grasa_total", receta.getGrasa_total());
            salida.put("hierro", receta.getHierro());
            salida.put("instrucciones", receta.getInstrucciones());
            salida.put("niacina", receta.getNiacina());
            salida.put("nombre", receta.getNombre());
            salida.put("potasio", receta.getPotasio());
            salida.put("proteina", receta.getProteina());
            salida.put("rivoflavina", receta.getRivoflavina());
            salida.put("sodio", receta.getSodio());
            salida.put("tiamina", receta.getTiamina());
            salida.put("vitamina_c", receta.getVitamina_c());
            salida.put("zinc", receta.getZinc());
            int codigo = -1;
            try {
                conexion = this.conectar("receta/",true);
                os = conexion.getOutputStream();
                os.write(salida.toString().getBytes("UTF-8"));
                os.close();
                codigo = conexion.getResponseCode();


                System.out.println(codigo); //TODO Borrar despues, solo para debug
            } catch (IOException e) {
                throw new Exception();
            }
        } catch (Exception e){

        }
    }

    private HttpsURLConnection conectar(String ruta, boolean usaToken) {

        HttpsURLConnection hpCon = null;

        try {
            URL hp = new URL("https://springceliaquia.herokuapp.com/api/" + ruta);

            hpCon = (HttpsURLConnection) hp.openConnection();

            hpCon.setConnectTimeout(5000);
            hpCon.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            if (usaToken){
                hpCon.setRequestProperty("Authorization","Bearer "+token);
            }
            hpCon.setDoOutput(true);
            hpCon.setDoInput(true);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return hpCon;
    }
}