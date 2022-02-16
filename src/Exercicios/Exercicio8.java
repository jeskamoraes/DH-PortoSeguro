package Exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		//EXERCÍCO 8
		//LÊ UMA VARIÁVEL NUMÉRICA N E IMPRIME SOMENTE SE A MESMA FOR MAIOR QUE 100,
		//CASO CONTRÁRIO IMPRIME COM VALOR 0.

		
		float N;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe um número");
		N = leia.nextFloat();
		
		if(N > 100)
		{
			System.out.println("\nNÚMERO MAIOR QUE 100");
			System.out.println("*************************");
			System.out.println(N);
			System.out.println("*************************");
		}
		else
		{
			N = 0;
			System.out.println(N);
		}
	}

}
