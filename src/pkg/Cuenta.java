package pkg;

public class Cuenta {

	private double saldo;
	
	public Cuenta(double saldo) {
		super();
		this.saldo=saldo;
	}

	public void ingresar(int cantidad) {
		setSaldo(this.saldo+cantidad);
	}

	public double getSaldo() {
		
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}

	public void retirar(int cantidad) {
		setSaldo(getSaldo()-cantidad);
	}

}
