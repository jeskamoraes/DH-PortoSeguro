package PortoSeguro;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// ARRAY
		
		String aluno[] = new String[5];
		/*String aluno;*/
		float[] media = new float[5]; //É NECESSÁRIO INSTANCIAR O TIPO DO DADO
		float nota1, nota2, nota3, somaMedia = 0, mediaGeral;
		int i;
		
		
		Scanner leitor = new Scanner(System.in);
		
		for(i = 0; i < 5; i++) 
		{
			
		System.out.println("Infome o nome do aluno: ");
		aluno[i] = leitor.next();
		
		
		System.out.println("Informe a primeira nota do aluno: ");
		nota1 = leitor.nextFloat();
		
			while(nota1 < 0 || nota1 > 10) {
				System.out.println("Informe novamente uma nota entre 0 e 10: ");
				nota1 = leitor.nextFloat();
			}
		
		System.out.println("Informe a segunda nota do aluno: ");
		nota2 = leitor.nextFloat();
		
			while(nota2 < 0 || nota2 > 10) {
				System.out.println("Informe novamente uma nota entre 0 e 10: ");
				nota2 = leitor.nextFloat();
			}
		
		System.out.println("Informe a terceira nota do aluno: ");
		nota3 = leitor.nextFloat();
		
			while(nota3 < 0 || nota3 > 10) {
				System.out.println("Informe novamente uma nota entre 0 e 10: ");
				nota3 = leitor.nextFloat();
			}
		
		media[i] = (nota1 + nota2 + nota3) / 3;
		System.out.println("Aluno " + aluno[i] + "\nMédia do aluno = " + media[i]);
		somaMedia += media[i];
		
		}
		mediaGeral = somaMedia / i;
		System.out.println("Média geral dos alunos = " + mediaGeral);
		
	}

}
