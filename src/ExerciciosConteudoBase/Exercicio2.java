package ExerciciosConteudoBase;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//EXERCÍCIO 2
		
		int codigoOperario, numeroHorasTrabalhadas;
		float valorExcedido, salario, salarioTotal, salarioExcedente;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("\nInforme o código do operário: ");
		codigoOperario = leitor.nextInt();
		
		System.out.println("\nInforme o número de horas trabalhadas: ");
		numeroHorasTrabalhadas = leitor.nextInt();

		
		
		if(numeroHorasTrabalhadas < 50)
		{
			salario = numeroHorasTrabalhadas * 10;
			valorExcedido = 0;
			salarioExcedente = 0;
			salarioTotal = salario + salarioExcedente;
			System.out.println("----------------------------");
			System.out.println("Código do operário: " + codigoOperario + "\nSalário excedente: R$ " + valorExcedido + "\nSalário total: R$ " + salarioTotal);
			System.out.println("----------------------------");
		}
		else
		{
			valorExcedido = numeroHorasTrabalhadas - 50;
			salarioExcedente = valorExcedido * 20;
			salario = (numeroHorasTrabalhadas - valorExcedido) * 10;
			salarioTotal = salario + salarioExcedente;
			System.out.println("----------------------------");
			System.out.println("Código do operário: " + codigoOperario + "\nSalário excedente: R$ " + salarioExcedente + "\nSalário total: R$ " + salarioTotal);
			System.out.println("----------------------------");
			
		}
		leitor.close();
	}

}
