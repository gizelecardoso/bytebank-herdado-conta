package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura";// object literal
		//String outro = new String("Alura");
		String outra = nome.replace('A', 'a');
		
//		char c = 'A';
//		char d = 'a';

//		char c = nome.charAt(2);
//		System.out.println(c);

//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		System.out.println(nome.length());
//		
//		for(int i =0; i<nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
		
		String vazio = " ";
		String outroVazio = vazio.trim();//tirar espaços.
		System.out.println(outroVazio.isEmpty());
		
		String vazio2 = "    Alura   ";
		String outroVazio2 = vazio2.trim();//tirar espaços.
		System.out.println(vazio2);
		System.out.println(vazio2.contains("Alu"));
		System.out.println(outroVazio2);
		
	
//		String novo = nome.toLowerCase();
//		String n = nome.toUpperCase();
//		
//		System.out.println(n);
//		System.out.println(nome);
//		System.out.println(novo);
//		System.out.println(outra);
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);

	}

}
