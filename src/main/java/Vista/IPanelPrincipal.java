package Vista;

import java.util.ArrayList;

import modelo.alimento.Alimento;

public interface IPanelPrincipal extends IVista {
	public void muestraAlimentos(ArrayList<Alimento> lista);
}
