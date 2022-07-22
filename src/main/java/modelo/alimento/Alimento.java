package modelo.alimento;

public class Alimento {
    private double acidos_grasos_monoinsaturados;
    private double acidos_grasos_poliinsaturados;
    private double acidos_grasos_saturados;
    private double agua;
    private double calcio;
    private double carbohidratos_disponibles;
    private double carbohidratos_total;
    private double ceniza;
    private String clasificacion;
    private double colesterol;
    private double energia_kj;
    private boolean es_accesible;
    private double fibra_dietetica;
    private double fosforo;
    private double grasa_total;
    private double hierro;
    private String imagen;
    private double niacina;
    private String nombre;
    private double potasio;
    private double proteina;
    private double rivoflavina;
    private double sodio;
    private double tiamina;
    private TipoAlimento tipo;
    private String variedad;
    private double vitamina_c;
    private double zinc;
    
    
    
	public Alimento(String nombre) {
		super();
		this.nombre = nombre;
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
	public double getCarbohidratos_disponibles() {
		return carbohidratos_disponibles;
	}
	public double getCarbohidratos_total() {
		return carbohidratos_total;
	}
	public double getCeniza() {
		return ceniza;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public double getColesterol() {
		return colesterol;
	}
	public double getEnergia_kj() {
		return energia_kj;
	}
	public boolean isEs_accesible() {
		return es_accesible;
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
	public String getImagen() {
		return imagen;
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
	public TipoAlimento getTipo() {
		return tipo;
	}
	public String getVariedad() {
		return variedad;
	}
	public double getVitamina_c() {
		return vitamina_c;
	}
	public double getZinc() {
		return zinc;
	}

	@Override
	public String toString() {
		return this.getNombre();
	}
    
    
}
