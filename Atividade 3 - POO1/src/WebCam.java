
public class WebCam {
	private String marca;
	private String nome;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public WebCam(String marca, String nome) {
		this.marca = marca;
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "WebCam [marca=" + marca + ", nome=" + nome + "]";
	}
	
	
	
	
}
