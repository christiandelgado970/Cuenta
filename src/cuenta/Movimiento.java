package cuenta;

public class Movimiento {

	
	double importe;
	signo signoTransf;
	String detalle;
	
	public Movimiento(double importe, signo signoTransf, String detalle)
	{
		this.importe = importe;
		this.signoTransf = signoTransf;
		this.detalle = detalle;
	}
}
