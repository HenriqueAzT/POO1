package atividade1_n1e2;

public class Lampada {

	boolean ligada;
	
	public void ligar(){
        setLigada(true);
    }
	
	public void desligar(){
        setLigada(false);
    }
	
	void mostrarEstado() {
		if (ligada) {
			System.out.println("Ligada.");
		} else {
			System.out.println("Desligada.");
		}
	}
	
	public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
}