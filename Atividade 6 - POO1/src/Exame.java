public class Exame extends ServicoOdontologico {
	
	public Exame(String descricao, Float preco, String tipoDeExame, String diagnostico) {
		super(descricao, preco);
		this.tipoDeExame = tipoDeExame;
		this.diagnostico = diagnostico;
	}
	
	private String tipoDeExame;
	private String diagnostico;
	
	public String getTipoDeExame() {
		return tipoDeExame;
	}
	public void setTipoDeExame(String tipoDeExame) {
		this.tipoDeExame = tipoDeExame;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	@Override
	public String imprimirRelatorio() {
		return "Descrição : " + this.getDescricao() + " Preço: " + this.getPreco() + " " + "tipoDeExame = " + tipoDeExame + ", diagnostico=" + diagnostico;
		
	}
}