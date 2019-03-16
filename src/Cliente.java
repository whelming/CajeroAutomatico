
public class Cliente {
//	datos > nombre / apellido / dni / clave / cuentas
//	crearcliente
//	consultar saldo REF (dni)
//	depositar (monto) REF
//	retirar REF
	
	String nombre = "";
	String apellido = "";
	int dni ;
	int clave;
	Cuenta c1 = null;
	
	public Cliente(){
		nombre = "GAY RAhit";
		String apellido = "Doblemente gay";
		int dni = 1234567;
		int clave =134;
		Cuenta c1;
	}
	public Cliente(String n, String a, int d, int c, Cuenta cu){
		this.nombre = n;
		this.apellido = a;
		this.dni = d;
		this.clave =c;
		this.c1  = cu;
	}
	
	public void consultar_Saldo() {
		c1.consultarSaldo();
	}
	public void depositar(int monto) {
		c1.depositar(monto);
	}
	public void retirar(int dinero) {
		c1.retirar(dinero);
	}
	
			
}
