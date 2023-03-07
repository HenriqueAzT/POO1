public class Assalariado extends Empregado{
	public Assalariado(String nome, float salario) {
		super(nome);
		this.salario = salario;
	}

	private float salario;
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public float vencimento() {
		return this.salario;
	}

}