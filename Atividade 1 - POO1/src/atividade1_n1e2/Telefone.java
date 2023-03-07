package atividade1_n1e2;

public class Telefone {

	private int numMinutos = 0;
	private double preco = 2.0;
	
	public void duracaoLigacao(int a) {
		numMinutos = a;
	}
	
	public void alterarPreco(double p) {
		preco = p;
	}
	
	public void mostrarConta() {
		System.out.println("Sua conta é de " + numMinutos * preco + " Reais");
	}
	
	public int getNumMinutos() {
		return numMinutos;
	}
	public void setNumMinutos(int numMinutos) {
		this.numMinutos = numMinutos;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
