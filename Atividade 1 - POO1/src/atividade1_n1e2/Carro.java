package atividade1_n1e2;

public class Carro {

	private double velocidade;
	
	public void acelerar() {
		this.velocidade += 10;
	}
	
	public void freiar() {
		this.velocidade -= 10;
	}
	
	public void mostrarVelocidade() {
		
		System.out.println("A velocidade é de: " + this.velocidade + "km/h");
	}
	
	public double getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade (double velocidade) {
		this.velocidade = velocidade;
	}
}