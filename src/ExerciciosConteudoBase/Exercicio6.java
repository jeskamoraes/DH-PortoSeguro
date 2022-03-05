package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		//EXERCÍCO 6
		//ELABORAR UM SISTEMA QUE DADA A IDADE DE UM NADADOR CLASSIFIQUE-O EM UMA DAS
		//SEGUINTES CATEGORIAS
		//INFANTIL A = 5 A 7 ANOS
		//INFANTIL B = 8 A 11 ANOS
		//JUVENIL A = 12 A 13 ANOS
		//JUVENIL B = 14 A 17 ANOS
		//ADULTOS = MAIORES DE 18
		
		int idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("------------------------------------------");
		System.out.println("\tCLASSIFICAÇÃO NADADOR");
		System.out.println("------------------------------------------");
		
		System.out.println("Informe a idade do nadador: ");
		idade = leia.nextInt();
		
	
		if(idade >= 5 && idade <=7)
		{
			System.out.println("INFANTIL A");
		}
		else if(idade >= 12 && idade <=13)
		{
			System.out.println("JUVENIL A");
		}
		else if(idade >= 8 && idade <=11)
		{
			System.out.println("INFANTIL B");
		}
		else if(idade >= 14 && idade <=17)
		{
			System.out.println("JUVENIL B");
		}
		else if(idade >= 18)
		{
			System.out.println("ADULTOS");
		}
		else
			{
			System.out.println("Menor que 5 anos. Idade inválida.");
			}
		}
	}


