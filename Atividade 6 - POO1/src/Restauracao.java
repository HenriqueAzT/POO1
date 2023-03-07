public class Restauracao extends ServicoOdontologico{
	
	public Restauracao(String descricao, Float preco, String nomeDoDente) {
		super(descricao, preco);
		this.nomeDoDente = nomeDoDente;
	}

	private String nomeDoDente;
	
	public String getNomeDoDente() {
		return nomeDoDente;
	}
	
	public void setNomeDoDente(String nomeDoDente) {
		this.nomeDoDente = nomeDoDente;
	}
	
	public String imprimirRelatorio() {
		return "Descrição: " + this.getDescricao() + " Preço: " + this.getPreco() + " Nome do Dente: " + this.nomeDoDente;
		
	}
}