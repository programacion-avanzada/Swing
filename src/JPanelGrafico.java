import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelGrafico extends JPanel {

	private Circulo circulo;
	private ImageIcon ladrillo;
	private ImageIcon bomba;
	private ArrayList<Circulo> listaBombas;

	public JPanelGrafico(Circulo circulo) {
		this.circulo = circulo;
		listaBombas = new ArrayList<Circulo>();
		ladrillo = new ImageIcon("./src/imagenes/images.png");
		bomba = new ImageIcon("./src/imagenes/bomba.png");
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//Dibujamos el Bomberman
		g.setColor(Color.BLUE);
		g.fillOval((int) circulo.getCentro().getX(), (int) circulo.getCentro().getY(), (int) circulo.getRadio(),
				(int) circulo.getRadio());
		
		// Vamos a diobujar las paredes
		g.setColor(Color.GRAY);
		g.fillRect(70, 70, 230, 10);
		g.fillRect(380, 70, 150, 10);
		g.fillRect(70, 150, 300, 10);
		g.fillRect(440, 70, 10, 160);
		g.fillRect(150, 150, 10, 160);
		g.fillRect(70, 230, 10, 160);
		g.fillRect(150, 380, 380, 10);
		g.fillRect(520, 150, 10, 240);
		g.fillRect(360, 310, 10, 80);
		
		//Agregar Imagenes
		g.drawImage(ladrillo.getImage(), 160, 160, 70, 70, null);
		g.drawImage(ladrillo.getImage(), 70, 80, 70, 70, null);
		
		//AgregarBomba
		for (Circulo circulo : listaBombas) {
			g.drawImage(bomba.getImage(), (int)circulo.getCentroAnterior().getX(), (int)circulo.getCentroAnterior().getY(), 50, 50, null);			
		}
	}
	
	public Circulo getCirculo() {
		return this.circulo;
	}
	
	public void setCirculo(Circulo circulo) {
		this.circulo = circulo;
	}
	
	public void agregarBomba() {
		listaBombas.add(circulo);
	}


}
