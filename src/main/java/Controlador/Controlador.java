package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.IVista;
import Vista.VentanaPrincipal;

public class Controlador implements ActionListener{
	
	private IVista vista;
	
	public Controlador(IVista vista) {
		this.vista = vista;
		this.vista.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equalsIgnoreCase("login")) {
			this.vista.cierraVentana();
			this.vista = new VentanaPrincipal();
		}
		
	}

}
