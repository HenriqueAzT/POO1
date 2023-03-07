import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nome;
	private String sala;
	private List<Professor> professores = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", sala=" + sala + ", professores=" + professores +"]";
	}
	public Disciplina(String nome, String sala, Professor p) {
		this.nome = nome;
		this.sala = sala;
		adicionaProfessor(p);
	}
	public void adicionaProfessor(Professor p) {
		if(!professores.contains(p) && professores.size() <= 10) {
			this.professores.add(p);
		}
	}
	public void removeProfessor(Professor p) {
		if(professores.contains(p) && professores.size() > 1) {
			this.professores.remove(p);
		}
	}
	
	public int qtdeProfessores() {
		return this.professores.size();
	}
	
	public void listarProfessores() {
		Professor aux = null;
		for (int i = 0; i <professores.size(); i++) {
			aux = professores.get(i);
			System.out.println("Nome " + aux.getNome());
		}
	}
	
}
