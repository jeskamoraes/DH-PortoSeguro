package POOInterface;

public class BaseFigura { // SUPER CLASSE
	
	// ATRIBUTOS 
	protected double lado1;
	protected double lado2;
	protected String nome;
	protected String nomeClasse;
	
	// CONSTRUTOR
	BaseFigura(double lado1, double lado2, String nome)
	{
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.nome = nome;
	}
	
	// MÉTODO
	public double getArea()
	{ // ESSE MÉTODO EXISTE NA INTERFACE
		return lado1 * lado2; // IMPLEMENTANDO MÉTODO
	}
	
	public double getPerimetro()
	{ // ESSE MÉTODO EXISTE NA INTERFACE
		return (lado1 + lado2) * 2.0; // IMPLEMENTANDO MÉTODO
	}
	
	public String getNome()
	{ // ESSE MÉTODO EXISTE NA INTERFACE
		return nome;
	}
	
	public void setNome(String nome)
	{ // ESSE MÉTODO EXISTE NA INTERFACE
		this.nome = nome; // IMPLEMENTANDO MÉTODO
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
}


	
