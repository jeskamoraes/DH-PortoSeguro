package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		//EXERCÍCIO 4
		//FAÇA UM SISTEMA QUE LEIA UM NÚMERO INTEIRO E MOSTRE UMA MENSAGEM INDICANDO SE ESTE
		//NÚMERO É PAR OU ÍMPAR, E SE É POSITIVO OU NEGATIVO.
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--------------------------------------------");
		System.out.println("\tPAR/ÍMPAR    POSITIVO/NEGATIVO");
		System.out.println("--------------------------------------------");
		
		System.out.println("Informe um número: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0 ) 
		{
			if (numero > 0 )
			{
				System.out.println("Par\nPositivo");
			}
			else
			{
				System.out.println("Par\nNegativo");
			}
		}
		else
		{
			if (numero < 0)
			{
				System.out.println("Impar\nNegativo");
			}
			else
			{
				System.out.println("Impar\nPositivo");
			}
		}

	}

}
