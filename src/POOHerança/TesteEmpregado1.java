package POOHerança;

public class TesteEmpregado1 {

	public static void main(String[] args) {
		
		Empregado1 empregado = new Empregado1("Edu", "Rua da Marola, 386", "54456978900", 
				999991111, 22, 123, 20000, 15);
		
		empregado.imprimirInfo();
		empregado.calcularSalario();
		
	}

}
