package cuenta;

public class Cuenta {
	
	String mNumero; 
    String nTitular;
    double cSaldo;
    
    public Cuenta(String numero, String titular, double saldo) {
    	this.cSaldo = saldo;
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

	
	public void retirar(int i) {
		setSaldo(100);
		
	}
	
	public  void ingresar(int i) {
		setSaldo(200);
		
	}

	

	

}
