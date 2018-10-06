import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class JVentanaConEventoClick extends JFrame {

	private int contadorClicks;
	private JPanel contentPane;
	private JTextField txtCantidadDeClicks;
	private JLabel lblCantidadDeClicks;

	public JVentanaConEventoClick() {
		setTitle("Contar Clicks");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 111);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCantidadDeClicks  = new JLabel("Cantidad de Clicks");
		lblCantidadDeClicks.setBounds(66, 11, 128, 14);
		contentPane.add(lblCantidadDeClicks);
		
		txtCantidadDeClicks = new JTextField();
		txtCantidadDeClicks.setBounds(184, 8, 86, 20);
		contentPane.add(txtCantidadDeClicks);
		txtCantidadDeClicks.setColumns(10);
		
		JButton btnNewButton = new JButton("Contar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contadorClicks++;
				txtCantidadDeClicks.setText(contadorClicks + "");
			}
		});
		btnNewButton.setBounds(131, 36, 89, 23);
		contentPane.add(btnNewButton);

		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JVentanaConEventoClick();
	}

}
