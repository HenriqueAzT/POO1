public class Comissionado extends Empregado {
	
	public Comissionado(String nome, float totalVenda, float taxaComissao) {
		super(nome);
		this.totalVenda = totalVenda;
		this.taxaComissao = taxaComissao;
	}
	private float totalVenda;
	private float taxaComissao;
	
	public float getTotalVenda() {
		return totalVenda;
	}
	public void setTotalVenda(float totalVenda) {
		this.totalVenda = totalVenda;
	}
	public float getTaxaComissao() {
		return taxaComissao;
	}
	public void setTaxaComissao(float taxaComissao) {
		this.taxaComissao = taxaComissao;
	}
	@Override
	
	public float vencimento() {
		return this.taxaComissao;
	}
	
	
}