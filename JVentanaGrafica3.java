import java.awt.Color;
import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class JVentanaGrafica3 extends JFrame {

	private JPanelGrafico2 contentPane;

	public JVentanaGrafica3() {
		super("Ejemplo Nro 2 Básico de Graphics");
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanelGrafico2(new Circulo(new Punto(50, 50), 50));
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				contentPane.setPuntoDestino(new Punto((double) arg0.getX(), (double)arg0.getY()));
				contentPane.moverAOtroPunto();
			}
		});

		setBackground(Color.WHITE);
		setContentPane(contentPane);
		setLocationRelativeTo(null);
	}
	
	public JPanelGrafico2 getPanel() {
		return contentPane;
	}
	
	public static void main(String[] args) {
		JVentanaGrafica3 ventana = new JVentanaGrafica3();
		ventana.setVisible(true);
	}

}
