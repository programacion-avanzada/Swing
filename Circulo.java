
public class Circulo {

	private Punto centro;
	private double radio;
	
	public Circulo(Punto centro, double radio) {
		this.centro = centro;
		this.radio = radio;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void desplazarHorizontalmente(double delta_x) {
		this.centro.desplazar(delta_x, 0);
	}
	
	public void desplazarVerticalmente(double delta_y) {
		this.centro.desplazar(0, delta_y);
	}
}
