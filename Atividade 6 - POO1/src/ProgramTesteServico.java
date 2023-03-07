
public class ProgramTesteServico {

	public static void main(String[] args) {
		ServicoOdontologico so1 = new Exame("Coleta de sangue", 50.0f, "Coleta", "Normal");
		ServicoOdontologico so2 = new Restauracao("Inserção de Prótese", 1050.0f, "Molar");
		
		System.out.println(so1.imprimirRelatorio());
		System.out.println(so2.imprimirRelatorio());
	}

}
