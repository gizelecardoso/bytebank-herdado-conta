package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<>();
		//ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta obj = new ContaCorrente(50,20);
		lista.add(obj);
		
		Conta obj1 = new ContaPoupanca(10,30);
		lista.add(obj1);
		
//		Cliente obj2= new Cliente();
//		obj2.setNome("Francisco");
//		lista.add(obj2.getNome());
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		Conta ref1 = lista.get(0);
		System.out.println(ref1.getNumero());

		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());

		
		Conta obj3 = new ContaCorrente(33,110);
		lista.add(obj3);
		
		Conta obj4 = new ContaPoupanca(33,310);
		lista.add(obj4);
		
		for(int i=0; i<lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		//for mais avançado, mas expressivo. - você quer iterar em cima da lista;
		
		System.out.println("------------");
		
		for(Conta oRef : lista) {
			System.out.println(oRef);
		}
	}

}
