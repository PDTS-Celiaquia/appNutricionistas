package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;

public class Vista2 extends JFrame implements  IVista{

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JList list;

	/**
	 * Create the frame.
	 */
	public Vista2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		this.menuBar = new JMenuBar();
		setJMenuBar(this.menuBar);
		
		this.mnNewMenu = new JMenu("Alimentos");
		this.menuBar.add(this.mnNewMenu);
		
		this.mntmNewMenuItem = new JMenuItem("Listado");
		this.mnNewMenu.add(this.mntmNewMenuItem);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.list = new JList();
		this.contentPane.add(this.list, BorderLayout.CENTER);
		this.setVisible(true);
	}

	@Override
	public void addActionListener(ActionListener a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cierraVentana() {
		// TODO Auto-generated method stub
		
	}

}
