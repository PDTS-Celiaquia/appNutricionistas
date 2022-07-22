package Vista;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.alimento.Alimento;

public class VentanaPrincipal extends JFrame implements IPanelPrincipal, ActionListener{
	
	Alimento[] alimentos = {new Alimento("Papas fritas"), new Alimento("Hamburguesa"),new Alimento("Sopa")};

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu menuAlimentos;
	private JMenuItem menuItemListadoAlimentos;
	private DefaultListModel<Alimento> modeloListaAlimentos = new DefaultListModel<Alimento>();
	private JTextField textFieldFiltro;
	private JList<Alimento> list;
	private JPanel panel;
	private JButton btnFiltrar;

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		this.menuBar = new JMenuBar();
		setJMenuBar(this.menuBar);
		
		this.menuAlimentos = new JMenu("Alimentos");
		this.menuBar.add(this.menuAlimentos);
		
		this.menuItemListadoAlimentos = new JMenuItem("Listado");
		this.menuAlimentos.add(this.menuItemListadoAlimentos);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.list = new JList<Alimento>(modeloListaAlimentos);
		this.contentPane.add(this.list, BorderLayout.CENTER);
		
		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {0, 0, 0, 0, 141, 30, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		this.panel.setLayout(gbl_panel);
		
		
		this.textFieldFiltro = new JTextField();
		GridBagConstraints gbc_textFieldFiltro = new GridBagConstraints();
		gbc_textFieldFiltro.gridwidth = 6;
		gbc_textFieldFiltro.fill = GridBagConstraints.BOTH;
		gbc_textFieldFiltro.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldFiltro.gridx = 1;
		gbc_textFieldFiltro.gridy = 0;
		this.panel.add(this.textFieldFiltro, gbc_textFieldFiltro);
		this.textFieldFiltro.setColumns(10);
		
		this.btnFiltrar = new JButton("Filtrar");
		GridBagConstraints gbc_btnFiltrar = new GridBagConstraints();
		gbc_btnFiltrar.insets = new Insets(0, 0, 0, 5);
		gbc_btnFiltrar.fill = GridBagConstraints.BOTH;
		gbc_btnFiltrar.gridx = 8;
		gbc_btnFiltrar.gridy = 0;
		this.panel.add(this.btnFiltrar, gbc_btnFiltrar);
		this.btnFiltrar.setActionCommand("filtrar");
		this.setVisible(true);
		
		this.inicializa();
	}

	private void inicializa() {
		
		for(int i = 0; i < alimentos.length ; i++) {
			this.modeloListaAlimentos.addElement(alimentos[i]);
		}
	}

	@Override
	public void addActionListener(ActionListener a) {
		this.btnFiltrar.addActionListener(this);
		
	}

	@Override
	public void cierraVentana() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void muestraAlimentos(ArrayList<Alimento> lista) {
		
		
	}

	private void filterModel(String filter) {
		this.modeloListaAlimentos.clear();
		if(filter.isBlank()) {
			for (Alimento s : alimentos)
				this.modeloListaAlimentos.addElement(s);
		}else {
			for (Alimento s : alimentos) {
				if (!s.getNombre().startsWith(filter)) {
					if (modeloListaAlimentos.contains(s)) {
						modeloListaAlimentos.removeElement(s);
					}
				} else {
					if (!modeloListaAlimentos.contains(s)) {
						modeloListaAlimentos.addElement(s);
					}
				}
			}
		}
		
	    
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equalsIgnoreCase("filtrar")) {
			this.filterModel(this.textFieldFiltro.getText());
		}
		
	}
}
