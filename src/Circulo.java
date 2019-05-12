
public class Circulo {

	private Punto centro;
	private Punto centroAnterior;
	private double radio;
	private EstadoMovimiento sentido;
	
	public Circulo(Punto centro, double radio) {
		this.centro = centro;
		this.centroAnterior = centro;
		this.radio = radio;
	}

	public Punto getCentro() {
		return centro;
	}
	
	public Punto getCentroAnterior() {
		return centroAnterior;
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
	
	public EstadoMovimiento getSentido() {
		return this.sentido;
	}
	
	public void desplazarHorizontalmente(double delta_x, EstadoMovimiento em) {
		this.sentido = em;
		this.centroAnterior = centro;
		this.centro.desplazar(delta_x, 0);
	}
	
	public void desplazarVerticalmente(double delta_y, EstadoMovimiento em) {
		this.sentido = em;
		this.centroAnterior = centro;
		this.centro.desplazar(0, delta_y);
	}
}
