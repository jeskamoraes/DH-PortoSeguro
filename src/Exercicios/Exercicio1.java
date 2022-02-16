package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//EXERCÍCIO 1
		
		float multa, pesoTomate, excessoPeso;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Informe o peso do produto (kg): ");
		pesoTomate = leitor.nextFloat();
		
		if(pesoTomate > 50)
		{
			excessoPeso = pesoTomate - 50;
			
			multa = excessoPeso * 4;
			System.out.println("----------------------------------");
			System.out.println("Peso excedente: " + excessoPeso + " kg\nMULTA R$ " + multa);
			System.out.println("----------------------------------");
		}
		else
		{
			multa = 0;
			excessoPeso = 0;
			System.out.println("----------------------------------");
			System.out.println("Peso excedente: " + excessoPeso + " kg\nMULTA R$ " + multa);
			System.out.println("----------------------------------");
		}
	}

}
