
public class Cliente {
//	datos > nombre / apellido / dni / clave / cuentas
//	crearcliente
//	consultar saldo REF (dni)
//	depositar (monto) REF
//	retirar REF
	
	String nombre = "";
	String apellido = "";
	int dni = "";
	int clave ="";
	Cuenta c1 = null;
	
	public Cliente(){
		nombre = "GAY RAhit";
		String apellido = "Doblemente gay";
		int dni = "12345678";
		int clave ="134";
		Cuenta c1;
	}
	public Cliente(String n, String a, int d, int c, Cuenta cu){
		this.nombre = n;
		this.apellido = a;
		this.dni = d;
		this.clave =c;
		this.c1  = cu;
	}
	
	public void consultar_Saldo(int dni) {
		c1.consultarSaldo(dni);
	}
	public void depositar(int dni, int monto) {
		c1.consultarSaldo(dni);
	}
	public void retirar(int dni, int) {
		c1.consultarSaldo(dni);
	}
	
			
}
