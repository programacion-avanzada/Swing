import java.awt.Color;
import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JVentanaGrafica extends JFrame {

	private JPanelGrafico contentPane;

	public JVentanaGrafica() {
		super("Ejemplo Básico de Graphics");
		setResizable(false);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				setMovimiento(arg0);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanelGrafico(new Circulo(new Punto(100, 100), 50));
		setBackground(Color.WHITE);
		setContentPane(contentPane);
		setLocationRelativeTo(null);
	}
	
	public void setMovimiento(KeyEvent evento){
		Circulo nuevo = contentPane.getCirculo();
		
		if(evento.getKeyCode() == KeyEvent.VK_LEFT) {
			nuevo.desplazarHorizontalmente(-5);
			contentPane.setCirculo(nuevo);
		}
		if(evento.getKeyCode() == KeyEvent.VK_RIGHT) {
			nuevo.desplazarHorizontalmente(5);
			contentPane.setCirculo(nuevo);		
		}
		if(evento.getKeyCode() == KeyEvent.VK_UP) {
			nuevo.desplazarVerticalmente(-5);
			contentPane.setCirculo(nuevo);
		}
		if(evento.getKeyCode() == KeyEvent.VK_DOWN) {
			nuevo.desplazarVerticalmente(5);
			contentPane.setCirculo(nuevo);
		}
		repaint();
	}

	public static void main(String[] args) {
		new JVentanaGrafica().setVisible(true);
	}
}
