package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	//Array [] tamb�m � um objeto;
	public static void main(String[] args) {
		
		//Quando eu crio, dou o new - preciso indicar a quantidade, no caso 5.
		int[] idades = new int[5];// inicializa o array com os valores padr�es no caso do int com zero;
		
//		idades[0] = 29;
//		idades[1] = 39;
//		idades[2] = 49;
//		idades[3] = 59;
//		idades[4] = 69;
//		
//		int idade1 = idades[0];
//		System.out.println(idade1);
//		int idade2 = idades[1];
//		System.out.println(idade2);
//		int idade3 = idades[2];
//		System.out.println(idade3);
//		int idade4= idades[3];
//		System.out.println(idade4);
//		int idade5 = idades[4];
//		System.out.println(idade5);
//		
//		System.out.println(idades.length);//quantas posi��es
//		
		//Guardar um conjunto de vari�veis;
		
		//Tentando acessar uma posi��o que n�o existe
		//Nova Esception ArrayIndexOutOfBoundsExceptions.
//		int idade50 = idades[49];
//		System.out.println(idade50);
		
		
		for (int i=0 ; i< idades.length; i++) {
			idades[i] = i*i;
		}
		for (int i=0 ; i< idades.length; i++) {
			System.out.println(idades[i]);
		}

	}

}
