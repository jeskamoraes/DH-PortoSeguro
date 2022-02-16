package Exercicios;

import java.util.Scanner;

public class Lista2Exercicio6 {

	public static void main(String[] args) {
		// EXERCÍCIO 6
		
		float numero, somaMultiplos = 0, count = 0; 
		float media;
		
		Scanner leitor = new Scanner(System.in);
		
		do
		{
			System.out.println("Digite um numero");
			numero = leitor.nextInt();
			
			if(numero != 0)
			{
				if(numero % 3 == 0)
				{
					count = count + 1;	
					somaMultiplos = somaMultiplos + numero;
				
				}
			}
			
			media = somaMultiplos / count;
		}
		while(numero != 0);
		System.out.printf("RESULTADO %.2f", media);
	}

}
