package POOInterface;

public interface Figuras { // DECLARANDO INTERFACE
	
	// ATRIBUTO
	public String nomeInterface = "Figuras"; 
	
	// MÉTODOS ABSTRATOS
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	// MÉTODOS NÃO ABSTRATOS
	public double getArea(); 
	public double getPerimetro();
	double getDiagonal();
}
