/*CLASSE AUTOR*/

import java.util.ArrayList;
import java.util.List;

public class Autor {

	private String nome;
	private String sexo;
	
	private List<Livro> livros = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Autor(String nome, String sexo, Livro l) {
		this.nome = nome;
		this.sexo = sexo;
		adicionaLivro(l);
	}
	
	public void adicionaLivro(Livro l) {
		if(!livros.contains(l)) {
			this.livros.add(l);
		}
	}
	
	public void removeLivro(Livro l) {
		if(livros.contains(l) && livros.size() > 1) {
			this.livros.remove(l);
		}
	}
	
	public int qtdeLivros() {
		return this.livros.size();
	}
	
	public void listarLivros() {
		Livro aux = null;
		for (int i = 0; i <livros.size(); i++) {
			aux = livros.get(i);
			System.out.println("Nome " + aux.getTitulo());	
		}
	}
	
	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", sexo=" + sexo + ", livro=" + livros + "]";
	}
	

}
