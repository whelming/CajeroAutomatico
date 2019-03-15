import java.util.Random;
import java.util.Scanner;

public class Cuenta {
	private String numeroCuenta;
	private double monto = 0;
	private String dni;
	private String tipoMoneda;

	
	public Cuenta(String tipoMoneda,String dni,double monto){
		this.numeroCuenta = numeroCuenta();
		this.tipoMoneda = tipoMoneda;
		this.dni = dni;
		this.monto = monto;
		}
	
	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda= tipoMoneda;
	}
	public void setDni(String dni) {
		this.dni= dni;
	}
	public void setMonto(int monto) {
		this.monto= monto;
	}
	
	public String getCuenta() {
		return this.numeroCuenta;
	}
	public String getTipoMoneda() {
		return this.tipoMoneda;
	} 
	public double getMonto() {
		return this.monto;
	}
	public String getDni() {
		return this.dni;
	}
	
	public double consultarSaldo(){
		return monto;
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public void depositar(double dinero) {
		monto= monto+dinero;
	}
	
	public void retirar(double dinero) {
		if (dinero>monto) {
			System.out.println("Monto insuficiente");
		}
		else {
			monto= monto-dinero;
		}
	}
	public static String numeroCuenta() {
	    Random random = new Random();
	    int cuenta = random.nextInt(999999);
	    return String.format("%06d", cuenta);
	}
	
	public void infoCuenta() {
		System.out.println("Dni:"+this.dni+"\t Cuenta N°: "+this.getCuenta()+"\t TipoMoneda: "+this.getTipoMoneda() +"\t Monto "+this.getMonto());
	}
	

	
}
