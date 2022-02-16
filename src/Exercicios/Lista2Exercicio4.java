package Exercicios;

import java.util.Scanner;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		// EXERCÍCIO 4
		
		int idade, sexo, opcao, cadastro = 1,
		opcaoCalma = 0,
								somaCalmaOutros = 0, 
								somaCalmaMenor = 0, 
								somaNervosaMulher = 0,
								somaNervosaMaior = 0,
								somaAgressivaHomem = 0;
		
		Scanner leitor = new Scanner (System.in);
		
		while(cadastro <= 3)
		{
			System.out.println("Informe a idade: ");
			idade = leitor.nextInt();
			
			System.out.println("Informe o sexo:\n 1 - FEMININO \n2-MASCULINO \n3-OUTROS");
			sexo = leitor.nextInt();
			
			switch(sexo)
			{
			case 1:
				break;
				
			case 2:
				break;
				
			case 3:
				break;
				default: break;
			}
			
			System.out.println("Em qual das opções a pessoa se encaixa: (Informe o número relacionado a opção!");
			System.out.println("\n1 - CALMA \n2 - NERVOSA \n3 - AGRESSIVA");
			opcao = leitor.nextInt();
			
			switch(opcao)
			{
			case 1:
				opcaoCalma++;
				break;
				
			case 2:
				break;
				
			case 3:
				break;
				default: break;
			}
			cadastro++;
			
			if(opcaoCalma == 1) 
			{
				opcaoCalma++;
			}
			else if(sexo == 1 && opcao == 2)
			{
				somaNervosaMulher++;
			}
			else if(sexo == 2 && opcao == 3)
			{
				somaAgressivaHomem++;
			}
			else if(sexo == 3 && opcao == 1)
			{
				somaCalmaOutros++;
			}
			else if(opcao == 2 && idade > 40)
			{
				somaNervosaMaior++;
			}
			else if(opcao == 1 && idade < 18)
			{
				somaCalmaMenor++;
			}
			
		}
		
		
			
		System.out.println("NÚMERO DE PESSOAS CALMAS: " + opcaoCalma + 
				"\nNÚMERO DE MULHERES NERVOSAS: " + somaNervosaMulher + 
				"\nNÚMERO DE HOMENS AGRESSIVOS " + somaAgressivaHomem + 
				"\nNÚMERO DE OUTROS CALMOS " + somaCalmaOutros + 
				"\nPESSOAS NERVOSAS COM MAIS DE 40 ANOS: " + somaNervosaMaior +
				"\nPESSOAS CALMAS COM MENOS DE 18 ANOS " + somaCalmaMenor);
		
	}

}
