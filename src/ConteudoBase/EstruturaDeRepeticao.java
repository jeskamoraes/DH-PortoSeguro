package ConteudoBase;

import java.util.Scanner;

public class EstruturaDeRepeticao {

	public static void main(String[] args) {
		
		// --------------- FOR E WHILE --------------- //
		
		float nota1, nota2, nota3, media, somaMedia = 0, mediaGeral;
		
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 1; i <=5; i++)
		{
			System.out.println("Notas do aluno " + i + " : ");
				
			System.out.println("Informe a primeira nota: ");
			nota1 = leitor.nextFloat();
			
			while(nota1 < 0 || nota1 > 10)
			{
				System.out.println("Você digitou um valor fora do intervalo de 0 a 10. Digite novamente!");
				nota1 = leitor.nextFloat();
			}
			
			System.out.println("Informe a segunda nota: ");
			nota2 = leitor.nextFloat();
			
			while(nota2 < 0 || nota2 > 10)
			{
				System.out.println("Você digitou um valor fora do intervalo de 0 a 10. Digite novamente!");
				nota2 = leitor.nextFloat();
			}
			
			System.out.println("Informe a terceira nota: ");
			nota3 = leitor.nextFloat();
			
			while(nota3 < 0 || nota3 > 10)
			{
				System.out.println("Você digitou um valor fora do intervalo de 0 a 10. Digite novamente!");
				nota3 = leitor.nextFloat();
			}
			
			media = (nota1 + nota2 + nota3) / 3;
			
			somaMedia = somaMedia + media;
			
		}
		mediaGeral = somaMedia / 5;
		System.out.printf("Média geral: %.2f", mediaGeral);

		
		// DO WHILE
		
		int tabuada, x = 1, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Qual tabuada deseja calcular? ");
		tabuada = leia.nextInt();
		
		do
		{
			resultado = x * tabuada;
			System.out.println(tabuada + " x " + x + " = " + resultado);
			x++;
		}
		while
		
			(x <= 10);
			
	}

}
