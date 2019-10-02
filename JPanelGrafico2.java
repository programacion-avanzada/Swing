import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanelGrafico2 extends JPanel {

	private Circulo circulo;
	private int contador;
	private Sentido direccion;
	private String mensaje;
	private Punto destino;

	public JPanelGrafico2(Circulo circulo) {
		this.circulo = circulo;
		this.contador = 0;
		this.direccion = Sentido.DERECHA;
		this.mensaje = "";
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLUE);
		g.fillOval((int) circulo.getCentro().getX() - ((int) circulo.getRadio()/2), (int) circulo.getCentro().getY() - ((int) circulo.getRadio() / 2), (int) circulo.getRadio(),
				(int) circulo.getRadio());
		g.setColor(Color.BLACK);
		g.drawString(mensaje, 400, 10);
	}
	
	public Circulo getCirculo() {
		return this.circulo;
	}
	
	public void setCirculo(Circulo circulo) {
		this.circulo = circulo;
	}
	
	public void setDireccion(Sentido direccion) {
		this.direccion = direccion;
	}
	
	public void setPuntoDestino(Punto destino) {
		this.destino = destino;
	}
	
	public void incrementaContador() {
		this.contador++;
		this.mensaje = "Cambios de Dirección: " + this.contador;
	}
	
	public void mensajeMovimiento() {
		this.mensaje = "Centro (x: " + this.circulo.getCentro().getX() +
				" , y: " + this.circulo.getCentro().getY() + ")";
	}
	
	public void mover() {
		if(direccion == Sentido.DERECHA) {
			circulo.desplazarHorizontalmente(3);
		}
		if(direccion == Sentido.IZQUIERDA) {
			circulo.desplazarHorizontalmente(-3);
		}
		if(direccion == Sentido.ARRIBA) {
			circulo.desplazarVerticalmente(-3);
		}
		if(direccion == Sentido.ABAJO) {
			circulo.desplazarVerticalmente(3);
		}
		repaint();
	}
	
	public void moverAOtroPunto() {
		new Thread() {
			public void run() {				
				if(circulo.getCentro().getX() <= destino.getX()) {
					for(int i = (int)circulo.getCentro().getX() -  - (int) circulo.getRadio(); i <= ((int)destino.getX() ); i+=3) {
						circulo.getCentro().setX((double) i);
						try {
							Thread.sleep(15);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						repaint();
					}
				}
				else {
					for(int i = (int)circulo.getCentro().getX(); i >= (int)destino.getX(); i-=3) {
						circulo.getCentro().setX((double) i);
						try {
							Thread.sleep(15);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						repaint();
					}
				}
				if(circulo.getCentro().getY() <= destino.getY()) {
					for(int i = (int)circulo.getCentro().getY(); i <= (int)destino.getY(); i+=3) {
						circulo.getCentro().setY((double) i);
						try {
							Thread.sleep(15);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						repaint();
					}
				}
				else {
					for(int i = (int)circulo.getCentro().getY(); i >= (int)destino.getY(); i-=3) {
						circulo.getCentro().setY((double) i);
						try {
							Thread.sleep(15);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						repaint();
					}
				}
			}
		}.start();
	}
	
}
