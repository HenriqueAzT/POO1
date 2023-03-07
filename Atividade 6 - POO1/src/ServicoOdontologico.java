public abstract class ServicoOdontologico implements Imprimivel{

	private String descricao;
	private Float preco;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Float getPreco() {
		return preco;
	}
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	public ServicoOdontologico(String descricao, Float preco) {
		this.descricao = descricao;
		this.preco = preco;
	}
	public String imprimirRelatorio() {
		return "ServicoOdontologico [descricao=" + descricao + ", preco=" + preco + "]";
	}
}