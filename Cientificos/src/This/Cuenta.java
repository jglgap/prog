package This;

public class Cuenta {
	private String numeroCuenta;
	private String titular;
	private double saldo;
	
	Cuenta(){
		this.numeroCuenta="";
		this.titular="";
		this.saldo=0.0;
	
	}
	Cuenta (String numeroCuenta, String titular, double saldo){
		this.numeroCuenta= numeroCuenta;
		this.titular= titular;
		this.saldo = saldo;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
