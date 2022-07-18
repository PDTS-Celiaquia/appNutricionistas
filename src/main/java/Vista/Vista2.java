package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Vista2 extends JFrame implements  IVista{

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Vista2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
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
