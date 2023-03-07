public abstract class Empregado {
	private String nome;
	
	abstract public float vencimento();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Empregado(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + "]";
	}
	
	
	
}