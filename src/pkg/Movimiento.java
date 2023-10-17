package pkg;

import pkg.Movimiento.signo;

public class Movimiento {

	private double importe;
	String detalle;
	public enum signo{D,H};
	private signo tipo;
	
	public Movimiento(double importe, String detalle, signo tipo) {
		super();
		this.importe = importe;
		this.detalle = detalle;
		this.tipo = tipo;
	}
}
