package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	private double saldo;
	private String titular;
	private String numero;
	
	List <Movimiento> mMovimientos = new ArrayList();
	
	public Cuenta(double saldo, String titular, String numero) {
		super();
		this.saldo=saldo;
		this.titular=titular;
		this.numero=numero;
	}

	public void ingresar(int cantidad) {
		setSaldo(this.saldo+cantidad);
		Movimiento mov = new Movimiento(cantidad, "Ingreso realizado" , Movimiento.signo.H);
		mMovimientos.add(mov);
		System.out.println("Ingreso realizado. Saldo: " + getSaldo());
	}


	public void retirar(int cantidad) {
		Movimiento mov;
		if((getSaldo()-cantidad)>=-500) {
			setSaldo(this.saldo-cantidad);
			mov = new Movimiento(cantidad, "Dinero retirado" , Movimiento.signo.D);
			System.out.println("Dinero retirado. Saldo: " + getSaldo());
			
		}else {
			mov = new Movimiento(cantidad, "No se ha podido retirar el dinero. Descubierto maximo: 500 euros" , Movimiento.signo.D);
			System.out.println("No se ha podido retirar el dinero. Saldo: " + getSaldo());
			
		}
		mMovimientos.add(mov);
	}
	
	public double getSaldo() {
		
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}

}
