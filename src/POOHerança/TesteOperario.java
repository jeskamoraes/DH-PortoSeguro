package POOHerança;

public class TesteOperario {

	public static void main(String[] args) {
		
		Operario operario = new Operario("Jessica Luz", "Avenida da Luz, 350", "42434799900", 58883333, 58, 15000.00, 15);
		
		operario.ValidarCpf();
		operario.imprimirInfo();
		operario.calcularProducao();
	}

}
