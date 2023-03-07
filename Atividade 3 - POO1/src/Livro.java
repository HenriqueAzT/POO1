/*CLASSE LIVRO*/
public class Livro {
	private String titulo;
	private String Categoria;
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", Categoria=" + Categoria + "]";
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public Livro(String titulo, String categoria) {
		
		this.titulo = titulo;
		Categoria = categoria;
	}
	
	
}
