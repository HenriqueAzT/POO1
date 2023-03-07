package atividade1_n1e2;

public class Atividade01 {

	public static void main(String[] args) {
		
		
		//----------------------Lâmpada----------------------
		
		Lampada lampada = new Lampada();
		
		lampada.ligar(); //Ligado
		
		lampada.desligar(); //Desligado
		
		lampada.mostrarEstado();
		
		//---------------------------------------------------
		
		
		//----------------------Carro-----------------------
		
		Carro carro1 = new Carro();
		
		carro1.acelerar(); //10 km/h
		carro1.acelerar(); //20 km/h
		carro1.acelerar(); //30 km/h
		carro1.freiar();   // 20 km/h
		carro1.mostrarVelocidade();
		
		//--------------------------------------------------
		
		//----------------------Pontos-----------------------
		
		Time TimeA = new Time();
		
		TimeA.ganharPartida(); //3 pontos
		TimeA.perderPartida(); //3 pontos
		TimeA.ganharPartida(); //6 pontos
		TimeA.ganharPartida(); //9 pontos
		TimeA.empatarPartida(); //10 pontos
		TimeA.mostrarPontos();
		
		//---------------------------------------------------
		
		//----------------------Relógio----------------------
		Relogio relogio = new Relogio();
		
		relogio.adicionarHora(); //7 horas
		relogio.adicionarHora(); //8 horas
		relogio.subtrairHora();  //7 horas
		relogio.adicionarHora(); //8 horas
		relogio.adicionarHora(); //9 horas
		relogio.mostrarHora();
		
		//---------------------------------------------------
		
		//----------------------Telefone----------------------
		
		Telefone telefone = new Telefone();
		
		telefone.duracaoLigacao(3);
		telefone.alterarPreco(15.25);
		telefone.mostrarConta();
		
		//----------------------------------------------------
	}
}

