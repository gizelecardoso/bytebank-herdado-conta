package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		//sintaxe padrão do array

		int idade = 29;
		
		
		//Integer idadeRef = new Integer(29);
		Integer idadeRef = Integer.valueOf(29);//método para criar objeto partir do primitivo - autoboxing
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);//2^16
		System.out.println(Integer.MIN_VALUE);//-2^16
		System.out.println(Integer.SIZE);//32 bits
		System.out.println(Integer.BYTES);// 4 bytes
		
		int valor = idadeRef.intValue();//tendo a referencia com objeto vc pede o objeto - unboxing
		
		String s = args[0];//"10"
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		//tranformar um string para um mais especifico = parsing
		
		
		List<Integer> numeros = new ArrayList<Integer>();//só existe coleção de referência.
		numeros.add(29); //numeros.add(idadeRef.intValue());

	}

}
