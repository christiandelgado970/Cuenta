package cuenta;

public class Cuenta {
	
	String mNumero; 
    String nTitular;
    double cSaldo;
    
    public Cuenta(String numero, String titular, double saldo) {
    	System.out.println("Inicio " + getSaldo());
    	this.cSaldo = saldo;
    	System.out.println("Inicio 2" + getSaldo());
    }

	public String getNumero() {
		return this.mNumero;
	}

	public String getTitular() {
		return this.nTitular;
	}

	public double getSaldo() {
		
		return this.cSaldo;
	}

	public  void setNumero(double cSaldo) {
		this.cSaldo = cSaldo;
	}
	
	public  void setTitular(String nTitular) {
		this.nTitular = nTitular;
	}


	public  void setSaldo(double cSaldo) {
		this.cSaldo = cSaldo;
	}

	public  void ingresar(int i) {
		
		System.out.println(getSaldo());
		setSaldo(this.getSaldo() + i);
		
	}
	
	public void retirar(int i) {
		
		System.out.println(getSaldo());
		setSaldo(this.getSaldo() - i);
		
	}
	
	

	

	

}
