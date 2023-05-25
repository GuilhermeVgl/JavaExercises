package aula5;

public class Conta {

	private String tipoDaConta;
	private String dono;
	private double saldo;
	private boolean status;

	public void abrirConta() {
		this.status = true;
		System.out.print("Conta aberta com sucesso!");
		this.saldo = saldo + 50;
	}

	public void fecharConta() {

		if (this.status == true) {
			if (this.saldo < 0) {
				System.out.print("Erro, não pode fechar uma conta com débito!");
			} else if (this.saldo > 0) {
				System.out.print("Erro, não pode fechar uma conta com débito em conta!");
			} else {
				this.status = false;
				System.out.print("Conta fechada com sucesso!");
			}
		} else {
			System.out.print("Conta não encontrada!");
		}
	}

	public void depositar(int v) {
		this.saldo = saldo + v;
	}

	public void sacar(int v) {
		this.saldo = saldo - v;
	}

	public void sacar() {

	}

	public String getTipoDaConta() {
		return tipoDaConta;
	}

	public void setTipoDaConta(String tipoDaConta) {
		this.tipoDaConta = tipoDaConta;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String nome) {
		this.dono = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
