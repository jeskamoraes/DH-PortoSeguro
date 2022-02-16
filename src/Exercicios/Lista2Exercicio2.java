package Exercicios;

import java.util.Scanner;

public class Lista2Exercicio2 {

	public static void main(String[] args) {
		// EXERCÍCIO 2
		
				int numero, par = 0, impar = 0;
				
				Scanner leitor = new Scanner(System.in);
				
				for (int i = 0; i <= 9; i++)
				{
					System.out.println("Digite um número inteiro: ");
					numero = leitor.nextInt();
					
					if(numero % 2 == 0)
					{
						par = par + 1;
					}
					else
					{
						impar = impar + 1;
					}
					
				}
				System.out.println("-----------------------------------------");
				System.out.println("QUANTIDE DE NÚMEROS PARES: " + par + " \nQUANTIDE DE NÚMEROS ÍMPARES: " + impar);
				System.out.println("-----------------------------------------");

	}

}
