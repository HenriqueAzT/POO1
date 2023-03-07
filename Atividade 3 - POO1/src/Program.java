/*CLASSE PROGRAM*/
public class Program {

	public static void main(String[] args) {
		
		/*LETRA A*/
		
		Livro l1 = new Livro("Memórias póstumas de Bras Cubas","Romance");
		Livro l2 = new Livro("Java Legal", "Autoajuda");
		
		Autor a1 = new Autor("Roberto", "Masculino", l1);
		
		a1.adicionaLivro(l2);

		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		System.out.println(a1.toString() + " Qtde livros: " + a1.qtdeLivros());
		a1.listarLivros();
		
		System.out.println("-------------------------------------------------------------------------------------");
		/*LETRA B*/
		
		Professor p1 = new Professor("Lucas", "Masculino");
		Professor p2 = new Professor("Débora", "Feminino");
		
		System.out.println(p1.toString());
		
		Disciplina d1 = new Disciplina("Matemática", "S-302", p1);
		
		d1.adicionaProfessor(p2);
		System.out.println(d1.toString());
		
		d1.listarProfessores();
		
		d1.removeProfessor(p2);
		System.out.println(d1.toString());
		
		System.out.println("-------------------------------------------------------------------------------------");
		/*LETRA C*/
		
		Teclado t1 = new Teclado("Multilaser", "ABNT-2");
		Teclado t2 = new Teclado("Razer", "ABNT");
		WebCam w1 = new WebCam("Logitech", "c920");
		WebCam w2 = new WebCam("asdasd", "aa");
		
		PC pc1 = new PC("Eduardo", "ACER", w1, t1);
		
		System.out.println(pc1);
		
		pc1.trocaTeclado(t2);
		pc1.adicionaWebcam(w2);
		pc1.removeWebcam();
		pc1.adicionaWebcam(w1);
		
		System.out.println(pc1);
	}

}
