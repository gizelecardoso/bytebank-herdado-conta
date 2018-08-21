package br.com.bytebank.banco.modelo;


public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		//super(); java escreve isso implicitamente
		super(agencia,numero);
	}
	
	//saque na Conta Corrente com taxa de 20centavos, reutilizo (primeiro pilar da herança)
	// e altero as info do valor a sacar.
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		// TODO Auto-generated method stub
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente, " + super.toString();
	}

}
