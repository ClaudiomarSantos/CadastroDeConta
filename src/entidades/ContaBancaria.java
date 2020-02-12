package entidades;

public class ContaBancaria {

	private int numConta;
	private String name;
	private double saldo = 0;

	public ContaBancaria(int numConta, String name) {
		this.numConta = numConta;
		this.name = name;

	}

	public void deposito(double saldo) {
		this.saldo += saldo;
	}

	public void saque(double saldo) {
		this.saldo -= (saldo + 5);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String toString() {
		return "Numero da conta: " + numConta 
				+ ", Nome Titular: " + getName() 
				+ ", saldo: R$ " +  String.format("%.2f%n", getSaldo());
	}

}
