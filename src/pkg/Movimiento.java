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

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public signo getTipo() {
		return tipo;
	}

	public void setTipo(signo tipo) {
		this.tipo = tipo;
	}
	
	
}
