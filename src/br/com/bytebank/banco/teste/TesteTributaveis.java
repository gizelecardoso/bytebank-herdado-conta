package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImpostos;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {
	
	public static void main(String[] args) {
		//Full Qualified Name FQN
		ContaCorrente cc = new ContaCorrente(222,223);
		cc.deposita(100.00);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImpostos calc = new CalculadorDeImpostos();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}


}
