package modelo.receta;

public class Receta {
    private double acidos_grasos_monoinsaturados;
    private double acidos_grasos_poliinsaturados;
    private double acidos_grasos_saturados;
    private double agua;
    private double calcio;
    private int cantidad_alimentos_accesibles;
    private int cantidad_alimentos_no_accesibles;
    private int cantidad_platos;
    private double carbohidratos_disponibles;
    private double carbohidratos_total;
    private double ceniza;
    private double colesterol;
    private String descripcion;
    private double energia_kj;
    private double fibra_dietetica;
    private double fosforo;
    private double grasa_total;
    private double hierro;
    private String instrucciones;
    private double niacina;
    private String nombre;
    private double potasio;
    private double proteina;
    private double rivoflavina;
    private double sodio;
    private double tiamina;
    private double vitamina_c;
    private double zinc;

    public Receta() {
        this.nombre = "milanesa completa";
        this.descripcion = "deliciosas milanesas";
        this.instrucciones = "comer";
    }

    public double getAcidos_grasos_monoinsaturados() {
        return acidos_grasos_monoinsaturados;
    }

    public double getAcidos_grasos_poliinsaturados() {
        return acidos_grasos_poliinsaturados;
    }

    public double getAcidos_grasos_saturados() {
        return acidos_grasos_saturados;
    }

    public double getAgua() {
        return agua;
    }

    public double getCalcio() {
        return calcio;
    }

    public int getCantidad_alimentos_accesibles() {
        return cantidad_alimentos_accesibles;
    }

    public int getCantidad_alimentos_no_accesibles() {
        return cantidad_alimentos_no_accesibles;
    }

    public int getCantidad_platos() {
        return cantidad_platos;
    }

    public double getCarbohidratos_disponibles() {
        return carbohidratos_disponibles;
    }

    public double getCarbohidratos_total() {
        return carbohidratos_total;
    }

    public double getCeniza() {
        return ceniza;
    }

    public double getColesterol() {
        return colesterol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getEnergia_kj() {
        return energia_kj;
    }

    public double getFibra_dietetica() {
        return fibra_dietetica;
    }

    public double getFosforo() {
        return fosforo;
    }

    public double getGrasa_total() {
        return grasa_total;
    }

    public double getHierro() {
        return hierro;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public double getNiacina() {
        return niacina;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPotasio() {
        return potasio;
    }

    public double getProteina() {
        return proteina;
    }

    public double getRivoflavina() {
        return rivoflavina;
    }

    public double getSodio() {
        return sodio;
    }

    public double getTiamina() {
        return tiamina;
    }

    public double getVitamina_c() {
        return vitamina_c;
    }

    public double getZinc() {
        return zinc;
    }
}
