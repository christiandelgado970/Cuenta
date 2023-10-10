package cuenta;

import java.util.ArrayList;

public class Cuenta {
	
	String mNumero; 
    String nTitular;
    double cSaldo;
    ArrayList <Movimiento> mMovimientos = new ArrayList<Movimiento>();
    
    public Cuenta(String numero, String titular, double saldo) {
    	
    	this.mNumero = numero;
    	this.nTitular = titular;
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
			System.out.println("Cuenta: "+ this.mNumero +" no puedes ingresar menos algo");
		}
		else {
			setSaldo(this.getSaldo() + i);
			mMovimientos.add(new Movimiento(i,signo.D,"Detalles"));
		}
	}
	
	public void retirar(int i) {
		
		if(i <= 0) {
			System.out.println("Cuenta: "+ this.mNumero +" no se puede retirar menos algo");
		}
		else {
			if((this.getSaldo() - i) >= -500) {
				setSaldo(this.getSaldo() - i);
				mMovimientos.add(new Movimiento(i,signo.H,"Detalles"));
			}
			else
				System.out.println("Cuenta: "+ this.mNumero +" no tienes suficiente dinero");
		}
		
	}
	
	

	

	

}
