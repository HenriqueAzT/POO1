package Atividade1_n3;

public class Elevador {

	private int capacidadeElevador;
	private int totalAndares;
	private int andarAtual = 0;
	private int qntdPessoas = 0;
	
	public void inicializa(int capacidade, int andares) {
		capacidadeElevador = capacidade;
		totalAndares = andares;
	}
	
	public void entra() {
		if (qntdPessoas < capacidadeElevador) {
			qntdPessoas += 1;
		}else {
			System.out.println("O elevador está lotado!");
		}
	}
	
	public void sai() {
		if (qntdPessoas > 0) {
			qntdPessoas -= 1;
		}else {
			System.out.println("O elevador está vazio!");
		}
	}
	
	public void sobe() {
		if (andarAtual < totalAndares) {
			andarAtual += 1;
		}else {
			System.out.println("Já estamos na cobertura!");
		}
	}
	
	public void desce() {
		if (andarAtual > 0) {
			andarAtual -= 1;
		}else {
			System.out.println("Já estamos no térreo!");
		}
	} 
	
	public void mostrarQntdPessoas() {
		System.out.println("Existe(em) " + qntdPessoas + " pessoa(as) no elevador");
	}
	
	public void mostrarAndar() {
		if(andarAtual == 0) {
			System.out.println("Estamos no térreo");
		} else {
			if(andarAtual == totalAndares) {
				System.out.println("Estamos na cobertura");
			}else {
				System.out.println("Estamos no " + andarAtual + "º Andar");
			}
		}
		
	}
	
	
	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}
	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}


	public int getQntdPessoas() {
		return qntdPessoas;
	}


	public void setQntdPessoas(int qntdPessoas) {
		this.qntdPessoas = qntdPessoas;
	}
	
	
}
