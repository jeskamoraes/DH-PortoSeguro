package Exercicios;

import java.util.Scanner;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		// EXERCÍCIO 3
		
		int idade, menor = 0, maior = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		idade = leitor.nextInt();
		
		while(idade != -99)
		{
			System.out.println("Digite a idade: ");
			idade = leitor.nextInt();
			
			if(idade <= 20)
			{
				menor = menor + 1;
			}
			
			else if(idade >= 51)
			{
				maior = maior + 1;
			}
			
			/*menor = idade <= 21;
			menor++;*/
		}
		System.out.println("MENORES DE 21: " + menor + "\nMAIORES DE 50: " + maior);
		leitor.close();
	}

}
