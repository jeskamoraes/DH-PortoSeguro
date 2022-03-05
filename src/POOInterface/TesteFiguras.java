package POOInterface;

public class TesteFiguras {

	public static void main(String[] args) {
		
		Quadrado figura1 = new Quadrado(10, "Quadrado1");
		Retangulo figura2 = new Retangulo(3, 4, "Retangulo1");
		
		System.out.println(figura1.getNome()+" : "+figura1.getDiagonal());
		System.out.println(figura2.getNome()+" : "+figura2.getDiagonal());

	}

}
