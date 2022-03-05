package POOPolimorfismo;

public class Celular extends Telefone {
	
	public Celular() {
		super("Telefone Celular");
	}
		@Override
		public void toca(int codigoToque)
		{
			switch(codigoToque)
			{
			case 1:
				System.out.println("\nShalamar...Shalamar...");
				break;
			case 2:
				System.out.println("\nTananinana...Tananinana...");
				break;
			default:
				System.out.println("\nTanana...Tanana...");
			}
		}
		
		@Override
		public void disca(String numero)
		{
			System.out.println("\nO número: "+numero+" é um celular...");
		}
}
