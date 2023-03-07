
public class ProgramTesteEmpregado {

	public static void main (String[] args) {
		
		Empregado e1 = new Comissionado("Elias", 5000.0f, 500.0f);
		Empregado e2 = new Horista("Beatriz", 150.0f, 8);
		Empregado e3 = new Assalariado("Carlos", 7890.0f);
		
		
		System.out.println("R$ " + e1.vencimento());
		System.out.println("R$ " + e2.vencimento());
		System.out.println("R$ " + e3.vencimento());
	}

}
