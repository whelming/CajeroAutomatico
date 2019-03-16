
public class Cajero {
	String dni;
	String clave;
	boolean loginok = false;
	double monto;
	Cuenta cuenta = null;
	Cliente cliente = null;
	
	public boolean login(String dni, String clave) {
		if ( dni.equals(cliente.getDni()) && clave.equals(cliente.getClave()) ){
			return true;
		}
		return false;
	}
	static void crearcuenta() {
		
	}
	static int consultarsaldo() {
		return stock;
	}
	static int depositar() {
		return stock;
	}
	static int crearcuenta() {
		return stock;
	}
	
//	crearcuenta (REF) 
//	consultar saldo (REF)
//	depositar
//	retirar
//	voucher MSJ 
			
}
