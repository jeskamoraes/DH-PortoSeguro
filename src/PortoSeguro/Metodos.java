package PortoSeguro;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		
		// ------------------- MÉTODOS ------------------- //
				int x, y;
				double raiz, potencia;
				
				Scanner leia = new Scanner(System.in);
				
				System.out.println("CALCULANDO RAÍZ E POTÊNCIA\n");
				System.out.println("Informe o valor de X: ");
				x = leia.nextInt();
				System.out.println("Informe o valor de Y: ");
				y = leia.nextInt();
				
				raiz = Math.sqrt(y); //Raiz quadrada
				potencia = Math.pow(x, 3); //Potência
				
				System.out.printf("Potência de " + x + " ^3 " + " = " + potencia);
				System.out.println("Raíz quadrada de " + y + " = " + raiz);
		
	}

}
