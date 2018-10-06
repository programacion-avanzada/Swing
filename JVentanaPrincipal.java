import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JVentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnAbrir;

	public JVentanaPrincipal() {
		setResizable(false);
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(90, 36, 262, 14);
		contentPane.add(lblNewLabel);
		
		btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abrirVentanaSecundaria();
			}
		});
		btnAbrir.setBounds(177, 98, 89, 23);
		contentPane.add(btnAbrir);
		setLocationRelativeTo(null);
	}
	
	private void abrirVentanaSecundaria() {
		new JVentanaSecundaria(this);
	}
	
	public void escribeTextoEnLabel(String texto) {
		lblNewLabel.setText(texto);
	}

	public static void main(String[] args) {
		new JVentanaPrincipal().setVisible(true);
	}
}
