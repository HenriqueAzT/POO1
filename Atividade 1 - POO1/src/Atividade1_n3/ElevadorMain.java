package Atividade1_n3;

public class ElevadorMain {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();

		elevador.inicializa(6, 23);
		elevador.entra(); // 1 pessoas, andar 0(terreo)
		elevador.sobe();  // 1 pessoas, andar 1
		elevador.sobe();  // 1 pessoas, andar 2
		elevador.sobe();  // 1 pessoas, andar 3
		elevador.entra(); // 2 pessoas, andar 3
		elevador.entra(); // 3 pessoas, andar 3
		elevador.sai();   // 2 pessoas, andar 3
		elevador.sobe();  // 2 pessoas, andar 4
		elevador.sobe();  // 2 pessoas, andar 5
		elevador.sai();	  // 1 pessoas, andar 5
		elevador.desce(); // 1 pessoas, andar 4
		elevador.desce(); // 1 pessoas, andar 3
		elevador.desce(); // 1 pessoas, andar 2
		elevador.desce(); // 1 pessoas, andar 1
		elevador.desce(); // 1 pessoas, andar 0(terreo)
		elevador.sai();   // 0 pessoas, andar 0(terreo)
		elevador.mostrarAndar();
		elevador.mostrarQntdPessoas();
		
	}

}
