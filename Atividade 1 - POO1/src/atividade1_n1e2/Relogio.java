package atividade1_n1e2;

public class Relogio {
	private int hora = 6;

	public void adicionarHora() {
		hora += 1;
		if (hora > 23) {
			hora =0;
		}
	}
	
	public void subtrairHora() {
		hora -= 1;
		if (hora < 0) {
			hora = 23;
		}
	}
	
	public void mostrarHora() {
		
		System.out.println("São " + this.hora + " horas");
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	} 
	
	
	
}
