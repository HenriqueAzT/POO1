package Programa;

import Utilitario.Utils;

public class Conta {

	private static int contadorDeContas = 1;
	
	private int numeroConta;
	private Pessoa pessoa;
	private Double saldo = 0.0;
	
	public Conta(Pessoa pessoa) {
		this.numeroConta = contadorDeContas;
		this.pessoa = pessoa;
		contadorDeContas += 1;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "\n Numero da Conta= " + this.getNumeroConta()  + 
				"\n Nome= " + this.pessoa.getNome() +
				"\n CPF= " + this.pessoa.getCPF() +
				"\n Email= " + this.pessoa.getEmail() +
				"\n Saldo= " + Utils.doubleToString(this.getSaldo())+ "\n";
	}
	
	public void depositar(Double valor) {
		if(valor > 0) {
			setSaldo(getSaldo() + valor);
			System.out.println("Depósito feito com sucesso!");			
		}else {
			System.out.println("Depósito não efetuado!");
		}
	}
	
	public void sacar(Double valor) {
		
	}
	
}
