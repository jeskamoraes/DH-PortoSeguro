package ConteudoBase;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		float altura;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("BEM VINDO");
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("\nDigite sua altura: ");
		altura = leia.nextFloat();
		
		System.out.println("--------------");
		System.out.println("NOME: " + nome + "\nIDADE: " + idade + "\nALTURA: " + altura);
		System.out.println("--------------");
		
		
		
	}

}
