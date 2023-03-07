
public class Teclado {
	private String marca;
	private String padrão;
	@Override
	public String toString() {
		return "Teclado [marca=" + marca + ", padrão=" + padrão + "]";
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPadrão() {
		return padrão;
	}
	public void setPadrão(String padrão) {
		this.padrão = padrão;
	}
	public Teclado(String marca, String padrão) {
		this.marca = marca;
		this.padrão = padrão;
	}
	
	
}
