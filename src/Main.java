import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		Integer nConta;
		Double sacar, depositar;
		Double limite_emprestimo = 2000.0;
		Double juros = 5.0;
		// Main
		while (true) {

			int escolha = 0;
			System.out.println("Sistema Bancario");
			System.out.println("----------------");
			System.out.println("[1]Cadastrar conta: ");
			System.out.println("[2]Cadastrar conta corrente: ");
			System.out.println("[3]Cadastrar conta poupança: ");
			System.out.println("[4]Sair: ");
			System.out.println("----------------");
			escolha = input.nextInt();
			while (escolha > 0 && escolha < 5) {

				if (escolha == 1) {
					System.out.println("Cadastro de conta");
					System.out.println("Nome: ");
					nome = input.next();
					System.out.println("Número da conta: ");
					nConta = input.nextInt();
					Conta conta = new Conta(nConta, nome, 0.0);
					System.out.println("Dados Bancários:");
					System.out.println("Nome: " + conta.getNomeCliente());
					System.out.println("Número da conta:" + conta.getNumero());
					System.out.println("Saldo: R$" + conta.getSaldo());
					while (true) {
						int acao = 0;
						System.out.println("Ações:");
						System.out.println("[1]Sacar: ");
						System.out.println("[2]Depositar: ");
						System.out.println("[3]Visualizar: ");
						System.out.println("[0]Voltar: ");

						acao = input.nextInt();
						while (true) {
							if (acao >= 0 && acao < 5) {
								if (acao == 1) {
									System.out.println("Valor do saque: ");
									sacar = input.nextDouble();
									conta.saque(sacar);
									break;

								} else if (acao == 2) {
									System.out.println("Valor do deposito: ");
									depositar = input.nextDouble();
									conta.depositar(depositar);
									break;
								} else if (acao == 3) {
									System.out.println("Dados Bancários:");
									System.out.println("Nome: " + conta.getNomeCliente());
									System.out.println("Número da conta:" + conta.getNumero());
									System.out.println("Saldo: R$" + conta.getSaldo());
									break;

								} else if (acao == 0) {
									System.out.println("voltando para o menu principal");
									break;
								}

							} else {
								System.out.println("Opção invalida, tente novamente");
								System.out.println("Ações:");
								System.out.println("[1]Sacar: ");
								System.out.println("[2]Depositar: ");
								System.out.println("[3]Visualizar: ");
								System.out.println("[4]Voltar: ");
								acao = input.nextInt();
							}

						}
						if (acao == 0) {
							escolha = acao;
							break;
						}

						if (escolha == 0) {
							break;
						}

					}

				} else if (escolha == 2) {
					System.out.println("Cadastro de conta corrente");
					System.out.println("Nome: ");
					nome = input.next();
					System.out.println("Número da conta: ");
					nConta = input.nextInt();
					ContaCorrente conta = new ContaCorrente(nConta, nome, 0.0, limite_emprestimo);
					System.out.println("Dados Bancários:");
					System.out.println("Nome: " + conta.getNomeCliente());
					System.out.println("Número da conta:" + conta.getNumero());
					System.out.println("Saldo: R$" + conta.getSaldo());
					while (true) {
						int acao = 0;
						System.out.println("Ações:");
						System.out.println("[1]Sacar: ");
						System.out.println("[2]Depositar: ");
						System.out.println("[3]Emprestimo: ");
						System.out.println("[4]Visualizar: ");
						System.out.println("[0]Voltar: ");

						acao = input.nextInt();
						while (true) {
							if (acao >= 0 && acao < 5) {
								if (acao == 1) {
									System.out.println("Valor do saque: ");
									sacar = input.nextDouble();
									conta.saque(sacar);
									break;

								} else if (acao == 2) {
									System.out.println("Valor do deposito: ");
									depositar = input.nextDouble();
									conta.depositar(depositar);
									break;
								} else if (acao == 3) {
									System.out.println("Fazer Emprestimo");
									System.out.println("Valor do emprestimo: ");
									depositar = input.nextDouble();
									conta.emprestimo(depositar);

									break;

								} else if (acao == 4) {
									System.out.println("Dados Bancários:");
									System.out.println("Nome: " + conta.getNomeCliente());
									System.out.println("Número da conta:" + conta.getNumero());
									System.out.println("Saldo: R$" + conta.getSaldo());
									break;
								} else if (acao == 0) {
									System.out.println("voltando para o menu principal");
									break;
								}
							} else {
								System.out.println("Opção invalida, tente novamente");
								System.out.println("Ações:");
								System.out.println("[1]Sacar: ");
								System.out.println("[2]Depositar: ");
								System.out.println("[3]Emprestimo: ");
								System.out.println("[4]Visualizar: ");
								System.out.println("[0]Voltar: ");
								acao = input.nextInt();
							}

						}
						if (acao == 0) {
							escolha = acao;
							break;
						}

						if (escolha == 0) {
							break;
						}
					}

				} else if (escolha == 3) {
					System.out.println("Cadastro de conta poupança");
					System.out.println("Nome: ");
					nome = input.next();
					System.out.println("Número da conta: ");
					nConta = input.nextInt();
					ContaPoupanca conta = new ContaPoupanca(nConta, nome, 0.0, juros);
					System.out.println("Dados Bancários:");
					System.out.println("Nome: " + conta.getNomeCliente());
					System.out.println("Número da conta:" + conta.getNumero());
					System.out.println("Saldo: R$" + conta.getSaldo());
					while (true) {
						int acao = 0;
						System.out.println("Ações:");
						System.out.println("[1]Sacar: ");
						System.out.println("[2]Depositar: ");
						System.out.println("[3]Render juros: ");
						System.out.println("[4]Visualizar: ");
						System.out.println("[0]Voltar: ");

						acao = input.nextInt();
						while (true) {
							if (acao >= 0 && acao < 5) {
								if (acao == 1) {
									System.out.println("Valor do saque: ");
									sacar = input.nextDouble();
									conta.saque(sacar);
									break;

								} else if (acao == 2) {
									System.out.println("Valor do deposito: ");
									depositar = input.nextDouble();
									conta.depositar(depositar);
									break;
								} else if (acao == 3) {
									System.out.println("Render juros");
									conta.renderJuros();
									break;

								} else if (acao == 4) {
									System.out.println("Dados Bancários:");
									System.out.println("Nome: " + conta.getNomeCliente());
									System.out.println("Número da conta:" + conta.getNumero());
									System.out.println("Saldo: R$" + conta.getSaldo());
									break;

								} else if (acao == 0) {
									System.out.println("voltando para o menu principal");
									break;
								}
							} else {
								System.out.println("Opção invalida, tente novamente");
								System.out.println("Ações:");
								System.out.println("[1]Sacar: ");
								System.out.println("[2]Depositar: ");
								System.out.println("[3]Render juros: ");
								System.out.println("[4]Visualizar: ");
								System.out.println("[0]Voltar: ");
								acao = input.nextInt();
							}

						}
						if (acao == 0) {
							escolha = acao;
							break;
						}

						if (escolha == 0) {
							break;
						}
					}

				} else if (escolha == 4) {
					System.out.println("Saindo do programa...");
					break;

				}

				else if (escolha < 0 || escolha > 4) {
					System.out.println("Opção invalida, tente novamente");
					break;
				} else {
					break;
				}
			}
			if (escolha == 4) {
				break;
			}

		}

	}

}
