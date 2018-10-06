import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JVentanaConEventoTeclado extends JFrame {

	private JLabel lblTeclado;

	public JVentanaConEventoTeclado() {
		super("Ventana con Evento de Teclado");
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				setTextoEvento(arg0);
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		lblTeclado = new JLabel("");
		lblTeclado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTeclado.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeclado.setBounds(121, 97, 202, 14);
		getContentPane().add(lblTeclado);
		
		setVisible(true);
	}
	
	public void setTextoEvento(KeyEvent evento){
		String teclado = "";
		if(evento.getKeyCode() == 38) {
			teclado = "ARRIBA";
		}
		if(evento.getKeyCode() == 40) {
			teclado = "ABAJO";
		}
		if(evento.getKeyCode() == 37) {
			teclado = "IZQUIERDA";
		}
		if(evento.getKeyCode() == 39) {
			teclado = "DERECHA";
		}
		lblTeclado.setText(teclado);
		setTitle(teclado);
	}

	public static void main(String[] args) {
		new JVentanaConEventoTeclado();
	}
}
