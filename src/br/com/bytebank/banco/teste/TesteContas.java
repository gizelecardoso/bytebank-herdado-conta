package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
	
	public static void main(String[] args) throws SaldoInsuficienteException{
		
		int a = 3;
		int b = a/0;
		
		ContaCorrente outra = null;
		outra.deposita(200.00);
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.00);
		
		cc.transfere(10.00, cp);
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		
	}

}
