import java.awt.Color;
import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class JVentanaGrafica2 extends JFrame {

	private JPanelGrafico2 contentPane;

	public JVentanaGrafica2() {
		super("Ejemplo Nro 1 Básico de Graphics");
		setResizable(false);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				setMovimiento(arg0);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanelGrafico2(new Circulo(new Punto(50, 50), 50));

		setBackground(Color.WHITE);
		setContentPane(contentPane);
		setLocationRelativeTo(null);
	}
	
	public JPanelGrafico2 getPanel() {
		return contentPane;
	}
	
	public void setMovimiento(KeyEvent evento){
	
		if(evento.getKeyCode() == KeyEvent.VK_LEFT) {
			contentPane.setDireccion(Sentido.IZQUIERDA);
		}
		if(evento.getKeyCode() == KeyEvent.VK_RIGHT) {
			contentPane.setDireccion(Sentido.DERECHA);		
		}
		if(evento.getKeyCode() == KeyEvent.VK_UP) {
			contentPane.setDireccion(Sentido.ARRIBA);
		}
		if(evento.getKeyCode() == KeyEvent.VK_DOWN) {
			contentPane.setDireccion(Sentido.ABAJO);
		}
		
		contentPane.incrementaContador();
	}
	
	public static void main(String[] args) {
		JVentanaGrafica2 ventana = new JVentanaGrafica2();
		ventana.setVisible(true);
		MiThread hilo = new MiThread(ventana.getPanel(), 20);
		hilo.start();
	}

}
