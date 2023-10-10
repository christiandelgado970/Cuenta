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

	public  void ingresar(int i) {
		
		if(i <= 0) {
			System.out.println("No puedes ingresar menos algo");
		}
		else {
			setSaldo(this.getSaldo() + i);
		}
		
	}
	
	public void retirar(int i) {
		
		if(i <= 0) {
			System.out.println("No se puede retirar menos algo");
		}
		else {
			if((this.getSaldo() - i) >= 0)
				setSaldo(this.getSaldo() - i);
			else
				System.out.println("No tienes suficiente dinero");
		}
		
	}
	
	

	

	

}
