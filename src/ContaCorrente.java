import java.util.Scanner;

public class ContaCorrente extends Conta {
	private Double limiteEmprestimo;

	// Constructor
	public ContaCorrente(Integer numero, String nomeCliente, Double saldo, Double limiteEmprestimo) {
		super(numero, nomeCliente, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	// Getters and Setters
	@Override
	public void saque(Double valor) {
		System.out.println("Seu saldo era de R$" + this.getSaldo());
		this.setSaldo((this.getSaldo() - (valor + 20)));
		System.out.println("Saque efetuado, taxa de R$20, valor sacado: R$" + valor);
		System.out.println("Novo saldo: R$" + this.getSaldo());

	}

	public void emprestimo(Double valor) {
		Scanner input = new Scanner(System.in);

		while (true) {
			if (valor <= this.getLimiteEmprestimo()) {
				System.out.println("Limite disponivel para emprestimo: " + this.getLimiteEmprestimo());
				this.setSaldo(this.getSaldo() + valor - 10);
				this.setLimiteEmprestimo(this.getLimiteEmprestimo() - (valor + 10));
				System.out.println("Emprestimo realizado com sucesso,foi cobrado uma taxa de R$10");
				System.out.println("Novo saldo: R$" + this.getSaldo());
				break;
			} else {
				System.out.println(
						"Não é possivel fazer um Emprestimo maior que o limite de" + this.getLimiteEmprestimo());
				System.out.println("Digite novamente um valor para fazer o emprestimo e 0 para sair: R$");
				Double nvalor = input.nextDouble();
				if (nvalor == 0) {
					System.out.println("Saindo...");
					break;
				} else {
					valor = nvalor;
				}
			}

		}
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

}
