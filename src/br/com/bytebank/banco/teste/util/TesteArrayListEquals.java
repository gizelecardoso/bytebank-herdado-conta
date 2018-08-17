package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		List<String> argumentos = Arrays.asList(args);//transformando array em list.
		
		
		
//		Conta cc1 = new ContaCorrente(22,22);
//		Conta cc2 = new ContaCorrente(22,22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
	
//		List<Conta> lista = new ArrayList<Conta>();
//		List<Conta> lista = new LinkedList<Conta>();
//		List<Conta> lista = new Vector<Conta>(); //thread safe
		Collection<Conta> lista = new Vector<Conta>(); //thread safe
	
		Conta cc = new ContaCorrente(50,20);
		lista.add(cc);
		
		Conta cc2 = new ContaPoupanca(10,30);
		lista.add(cc2);
		
		Conta cc3 = new ContaPoupanca(10,30);
		boolean existe = lista.contains(cc2);
		System.out.println("Já existe?: " + existe);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	
	}

}
