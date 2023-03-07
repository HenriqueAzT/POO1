package atividade1_n1e2;

public class Time {

	private int pontosGanhos;

	public void ganharPartida() {
		this.pontosGanhos += 3;
	}
	
	public void empatarPartida() {
		this.pontosGanhos += 1;
	}
	
	public void perderPartida() {
		this.pontosGanhos += 0;
	}
	
	public void mostrarPontos() {
		
		System.out.println("O seu time atualmente tem " + this.pontosGanhos + " pontos");
	}
	
	public int getPontos() {
		return pontosGanhos;
	}

	public void setPontos(int pontos) {
		this.pontosGanhos = pontos;
	}
	
	
}


