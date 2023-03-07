public class Horista extends Empregado {
	
	public Horista(String nome, float precoHora, float horasTrabalhadas) {
		super(nome);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	private float precoHora;
	private float horasTrabalhadas;
	
	public float getPrecoHora() {
		return precoHora;
	}
	public void setPrecoHora(float precoHora) {
		this.precoHora = precoHora;
	}
	public float getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(float horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	@Override
	public float vencimento() {
		return this.horasTrabalhadas * precoHora;
	}
}