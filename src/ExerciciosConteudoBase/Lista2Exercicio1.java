package Exercicios;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		// EXERCÍCIO 1
		
		System.out.println("-------------------------------------------------");
		System.out.println("O programa imprime os números entre 1000 e 1999 \nque divididos por 11, apresentam resto igual a 5.");
		System.out.println("-------------------------------------------------");
				
		for (int i = 1000; i <= 1999; i++)
		{
			if(i % 11 == 5)
			{
			System.out.println(i);
			}
		}
	}

}
