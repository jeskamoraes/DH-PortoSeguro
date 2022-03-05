package POOClasse;

import java.text.NumberFormat;

public class Empregado {

	// ATRIBUTOS DA CLASSE
	private String nome;
	private double salario;
	
	// CONSTRUTOR
	public Empregado (String n, double s) {
		this.setNome(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual / 100;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // DEFINE O TIPO DA MOEDA
		nf.setMaximumFractionDigits(2); // DEFINE QUANTAS CASAS DEPOIS DA VÍRGULA
		String formatoMoeda = nf.format(salario); // FORMATA O NÚMERO COM PONTO
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println(nome + "\t\t" + "Salário: " + this.formatarMoeda());
	}
}
