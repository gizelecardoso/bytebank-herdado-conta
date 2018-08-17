package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
	
		//Guardar 10 contas;
		//int[] idades = new int[5];
		
		Object[] referencias = new Object[5];
		//Conta[] contas = new Conta[5];
		//s� criei um array que guarda 5 contas, mas n�o criei nenhuma conta.

		
		ContaCorrente cc1 = new ContaCorrente(24,14);
		referencias[0] = cc1;
		//get.Numero n�o compila porque a ref esta na class Object que n�o possui esse m�todo.
		//System.out.println("Conta Corrente: N�mero: " + contas[0].getNumero()
											//+ " Ag�ncia: " + contas[0].getAgencia());
		
		ContaPoupanca cc2 = new ContaPoupanca(23,13);
		referencias[1] = cc2;
		//System.out.println("Conta Corrente: N�mero: " + contas[1].getNumero()
											//+ " Ag�ncia: " + contas[1].getAgencia());
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		
		// 3 refer�ncias para o mesmo obj.
		ContaPoupanca ref = (ContaPoupanca) referencias[1];//cast ou type cast;
		//Conta ref = contas[1];
		//System.out.println(referencias[1].getNumero());
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		//NOVA EXCE��O
		// Exception - ClassCastException;
		//ContaCorrente ref1 = (ContaCorrente) contas[1];//cast ou type cast;
		
		
	}

}
