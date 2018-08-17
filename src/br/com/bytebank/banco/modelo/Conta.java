package br.com.bytebank.banco.modelo;

/**
 * 
 * Classe representa a moldura de uma conta
 * 
 * @author Gisele
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>{

	// Temos 4 atributos - características - o que toda conta tem.
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	//comportamentos - o que toda conta faz. - MÉTODOS, maneira de fazer algo.
	// nome do método - deposita, 
	//entre parenteses o que recebe, no caso o valor e o tipo da variável valor, no caso double.
	//nesse caso não terá retorno, então ele é um void.
	
	//construtores
	
	/**
	 * 
	 * Construtor para inicializar o objeto conta a partir da agencia.
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		
		Conta.total++;
		System.out.println("O total de contas é: " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + this.numero);
		
	}
	
	//
	public abstract void deposita(double valor);
	
	// já sei em que conta estou, eu já estou orientado a um objeto.
	
	/**
	 * 
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException{
		
		if(this.saldo<valor) {
			throw new SaldoInsuficienteException("Saldo:" + this.saldo + ", Valor: " + valor);
		}	
			this.saldo -= valor; //this.saldo = this.saldo - valor;	
	
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		
		this.saca(valor);
		destino.deposita(valor);
		
	}
	
	public double getSaldo() { //pegaSaldo.
		
		return this.saldo;
	}
	
	public int getNumero() {
		
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero<=0) {
			System.out.println("Não pode valor menor igual a zero");
			return;
		}

		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <=0) {
			System.out.println("náo pode valor menor igual a 0");
			return; //retorna nada porque é um void
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta)  ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
		return "Número: " + this.numero + ", Agência:" + this.agencia + ", Saldo: " + this.saldo;
	}
}
