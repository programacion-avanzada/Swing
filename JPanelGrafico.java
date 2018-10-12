import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanelGrafico extends JPanel {

	private Circulo circulo;

	public JPanelGrafico(Circulo circulo) {
		this.circulo = circulo;
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval((int) circulo.getCentro().getX(), (int) circulo.getCentro().getY(), (int) circulo.getRadio(),
				(int) circulo.getRadio());
	}
	
	public Circulo getCirculo() {
		return this.circulo;
	}
	
	public void setCirculo(Circulo circulo) {
		this.circulo = circulo;
	}

}
