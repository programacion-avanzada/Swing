import java.awt.Color;
import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JVentanaGrafica extends JFrame {

	private JPanelGrafico contentPane;

	public JVentanaGrafica() {
		super("Ejemplo Básico de Graphics");
		setResizable(false);		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanelGrafico(new Circulo(new Punto(10, 10), 50));
		setBackground(Color.WHITE);
		setContentPane(contentPane);

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				setMovimiento(arg0);
			}
		});
				
		setLocationRelativeTo(null);
	}
	
	public void setMovimiento(KeyEvent evento){
		Circulo nuevo = contentPane.getCirculo();
		
		if(evento.getKeyCode() == KeyEvent.VK_LEFT) {
			nuevo.desplazarHorizontalmente(-5, EstadoMovimiento.IZQUIERDA);
			contentPane.setCirculo(nuevo);
		}
		if(evento.getKeyCode() == KeyEvent.VK_RIGHT) {
			nuevo.desplazarHorizontalmente(5, EstadoMovimiento.DERECHA);
			contentPane.setCirculo(nuevo);		
		}
		if(evento.getKeyCode() == KeyEvent.VK_UP) {
			nuevo.desplazarVerticalmente(-5, EstadoMovimiento.ARRIBA);
			contentPane.setCirculo(nuevo);
		}
		if(evento.getKeyCode() == KeyEvent.VK_DOWN) {
			nuevo.desplazarVerticalmente(5, EstadoMovimiento.ABAJO);
			contentPane.setCirculo(nuevo);
		}
		if(evento.getKeyCode() == KeyEvent.VK_B) {
			contentPane.setCirculo(nuevo);
			contentPane.agregarBomba();
		}
		repaint();
	}

	public static void main(String[] args) {
		new JVentanaGrafica().setVisible(true);
	}
}
