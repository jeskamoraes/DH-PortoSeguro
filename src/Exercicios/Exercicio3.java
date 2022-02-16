package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//EXERCÍCIO 3
		//DESENVOLVA UM SISTEMA QUE 
		//-LEIA 4 NÚMEROS
		//-CALCULE O QUADRADO DE CADA UM
		//-SE O VALOR RESULTANTE DO QUADRADO DO TERCEIRO FOR >=1000, IMPRIMA-O E FINALIZE
		//-CASO CONTRÁRIO, IMPRIMA OS VAORES LIDOS E SEUS RESPECTIVOS QUADRADOS
		
		int n1, n2, n3, n4;
		double quadradoN1, quadradoN2, quadradoN3, quadradoN4;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("-----------------------------------");
		System.out.println("\tQUADRADO DO NÚMERO");
		System.out.println("-----------------------------------");
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();
		
		System.out.println("Digite o quarto número: ");
		n4 = leia.nextInt();
		
		quadradoN1 = Math.pow(n1, 2);
		quadradoN2 = Math.pow(n2, 2);
		quadradoN3 = Math.pow(n3, 2);
		quadradoN4 = Math.pow(n4, 2);
		
		if (quadradoN3 >= 1000) 
		{
			System.out.println("O quadrado do número " + n3 + " = "  + quadradoN3 + " ----> MAIOR QUE 1000.");
		}
		else
		{
			System.out.println(n1 + " ^ " + " 2 = " + quadradoN1);
			System.out.println(n2 + " ^ " + " 2 = " + quadradoN2);
			System.out.println(n3 + " ^ " + " 2 = " + quadradoN3);
			System.out.println(n4 + " ^ " + " 2 = " + quadradoN4);
		}
		
		
	}

}
