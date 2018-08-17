package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorOReferencias {
	
	public static void main(String[] args) {
		
		//Referencia genérica - Objetc
		
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Object obj = new ContaCorrente(22,10);
		guardador.adiciona(obj);
		
		Object obj1 = new ContaPoupanca(22,10);
		guardador.adiciona(obj1);
		
		Object obj2 = new Cliente();
		guardador.adiciona(obj2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		//Tivemos que transformar em refência específica.
		Conta ref = (Conta) guardador.getReferencia(1);
		System.out.println(ref.getNumero());
		
		
	}

}
