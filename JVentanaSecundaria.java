import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JVentanaSecundaria extends JDialog {

	private JPanel contentPanel;
	private JTextField textField;
	private JLabel lblMensaje;
	private JButton btnNewButton;
	private JVentanaPrincipal principal;
	
	public JVentanaSecundaria(JVentanaPrincipal principal) {
		setModal(true);
		this.principal = principal;
		contentPanel = new JPanel();
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 399, 113);
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblMensaje = new JLabel("Mensaje");
		lblMensaje.setBounds(10, 14, 58, 14);
		contentPanel.add(lblMensaje);
		
		textField = new JTextField();
		textField.setBounds(80, 11, 287, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				principal.escribeTextoEnLabel(textField.getText());
				dispose();
			}
		});
		btnNewButton.setBounds(278, 42, 89, 23);
		contentPanel.add(btnNewButton);
		setLocationRelativeTo(principal);
		
		setVisible(true);
	}
}
