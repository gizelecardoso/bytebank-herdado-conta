package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

		System.out.println("x");
		System.out.println(3);
		System.out.println(false);

		Object cc = new ContaCorrente(22,33);
		//ContaCorrente cc = new ContaCorrente(22,33);
		Object cp = new ContaPoupanca(23,32);
		//ContaPoupanca cp = new ContaPoupanca(23,32);
		Object cliente = new Cliente();
		//Cliente cliente = new Cliente();
		
		System.out.println(cc.toString());
		//System.out.println(cc.toString());
		System.out.println(cp);
//		br.com.bytebank.banco.modelo.ContaCorrente@2f410acf
//		br.com.bytebank.banco.modelo.ContaPoupanca@47089e5f

		
		println(cc);
		println(cp);
		println(cliente);
		
		
	}
		
		static void println() {
			
		}

		static void println(int a) {
			
		}
		
		static void println(boolean valor) {
			
		}
		
		static void println(Object conta) {
			
		}
		
}
