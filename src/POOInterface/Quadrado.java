package POOInterface;

public class Quadrado extends BaseFigura implements Figuras{ 
	// SUBCLASSE, EXTENDENDO DA CLASSE BASE FIGURA
	// IMPLEMENTANDO DA INTERFACE FIGURAS
	
	// CONSTRUTOR
	Quadrado(double lado, String nome)
	{
		super(lado, lado, nome); // CHAMANDO ATRIBUTOS DA SUPER CLASSE
		nomeClasse = "Quadrado";
	}
	
	@Override
	public double getDiagonal()
	{
		return Math.sqrt(2)*lado1;
	}



	
	
}
