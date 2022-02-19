package Exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// EXERCÍCO 7
		// RECEBER VALORES DE BASE E ALTURA DE UM TRIÂNGULO E VERIFICAR SE SÃO VALORES
		// VÁLIDOS
		// (POSITIVOS MAIORES QUE 0). EM CASO AFIRMATIVO, CALCULAR A ÁREA DO TRIÂNGULO.

		float base, altura, area;

		Scanner leia = new Scanner(System.in);

		System.out.println("-------------------------------");
		System.out.println("CALCULO DA ÁREA DO TRIÂNGULO");
		System.out.println("-------------------------------");

		System.out.println("Informe o valor da base: ");
		base = leia.nextFloat();

		System.out.println("Informe o valor da altura: ");
		altura = leia.nextFloat();

		if (base > 0) {
			if (altura > 0) {
				area = (base + altura) / 2;
				System.out.println("--------> ÁREA = " + area);
			} else {
				System.out.println("Número inválido! Informe novamente o valor da altura: ");
				altura = leia.nextFloat();

				area = (base + altura) / 2;
				System.out.println("--------> ÁREA = " + area);
			}
		} else {
			System.out.println("Número inválido! Informe novamente o valor da base: ");
			base = leia.nextFloat();

			area = (base + altura) / 2;
			System.out.println("--------> ÁREA = " + area);

		}

	}

}
