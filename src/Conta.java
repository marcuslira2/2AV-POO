import java.util.Scanner;

public class Conta {

	private Integer numero;
	private String nomeCliente;
	private Double saldo;

	// Constructor
	public Conta(Integer numero, String nomeCliente, Double saldo) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public void depositar(Double valor) {
		this.setSaldo(this.getSaldo() + valor);
		System.out.println("Desposito feito com sucesso");

	}

	public void saque(Double valor) {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				if (valor <= this.getSaldo()) {
					System.out.println("Saldo atual: R$" + this.getSaldo());
					this.setSaldo(this.getSaldo() - valor);
					System.out.println("Saque realizado com sucesso");
					System.out.println("Novo saldo: R$" + this.getSaldo());
					break;
				} else {
					System.out.println("Não é possivel fazer um saque maior que o saldo da conta");
					System.out.println("Digite novamente um valor para sacar e 0 para sair: R$");
					Double nvalor = input.nextDouble();
					if (nvalor == 0) {
						System.out.println("Saindo...");
						break;
					} else {
						valor = nvalor;
					}

				}

			} catch (Exception erro) {
				System.out.println("Erro: " + erro);
			}

		}

	}

	// Getters and Setters
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
