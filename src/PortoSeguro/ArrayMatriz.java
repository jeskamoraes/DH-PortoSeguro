package PortoSeguro;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		// MATRIZ
		
		int[][] numeros = new int [2][3];
		int linha, coluna, quantidadePar = 0, somaImpar = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		for(linha = 0; linha < 2; linha++)
		{
			for(coluna = 0; coluna < 3; coluna++)
			{
				System.out.println("Digite um numero");
				numeros[linha][coluna] = leitor.nextInt();
				
				if(numeros[linha][coluna] % 2 == 0)
				{
					quantidadePar++;
				}
				else
				{
					somaImpar += numeros[linha][coluna];
				}
			}
		}
		System.out.println("Quantidade de número pares: " + quantidadePar + "\nSoma dos números ímpares: " + somaImpar);

	}

}
