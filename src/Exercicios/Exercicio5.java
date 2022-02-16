package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//EXERCÍCIO 5
		
		float indicePoluicao;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("--------------------");
		System.out.println("ÍNIDICE DE POLUIÇÃO");
		System.out.println("--------------------");
		
		System.out.println("Informe o índice de poluição: ");
		indicePoluicao = leitor.nextFloat();
		/*
		if(indicePoluicao < 0.25)
		{
			System.out.println("\n ----> Índice aceitável");
		}
		else if(indicePoluicao >= 0.3 && indicePoluicao < 0.4)
		{
			System.out.println("\n ----> Indústrias do 1º grupo devem suspender suas atividades");
		}
		else if(indicePoluicao >= 0.4 && indicePoluicao < 0.5)
		{
			System.out.println("\n ----> Indústrias do 1º e 2º grupos devem suspender suas atividades");
		}
		else if(indicePoluicao >= 0.5)
		{
			System.out.println("\n ----> Indústrias do 1º, 2º e 3º grupos devem suspender suas atividades");
		}*/
		
		if(indicePoluicao < 0.25)
		{
			System.out.println("\n ----> Índice aceitável");
		}
		else if(indicePoluicao == 0.3f)
		{
			System.out.println("\n ----> Indústrias do 1º grupo devem ter suas atividades suspensas");
		}
		else if(indicePoluicao == 0.4f)
		{
			System.out.println("\n ----> Indústrias do 1º e 2º grupo devem ter suas atividades suspensas");
		}
		else if(indicePoluicao >= 0.5f)
		{
			System.out.println("\n ----> Indústrias do 1º, 2º e 3º grupo devem ter suas atividades suspensas");
		}
	}
}


