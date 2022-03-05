package POO;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Empregado lista[] = new Empregado[3];
		
		lista[0] = new Empregado("Ana Kélvia", 10000);
		lista[1] = new Empregado("Lucas Theberge", 11000);
		lista[2] = new Empregado("Leticia Toffoli",30000);
		
		// A PARTIR DA CLASSE EMPREGADO 'RODA'  TAL OBJETO
		for(Empregado roda:lista)
		{
			roda.imprimir();
		}
		
		System.out.println("**********************************************");
		
		for(Empregado roda:lista)
		{
			roda.aumentarSalario(10);
			roda.imprimir();
		}
		

	}

}
