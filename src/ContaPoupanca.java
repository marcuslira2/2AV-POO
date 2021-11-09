import java.util.Scanner;

public class ContaPoupanca extends Conta {
	
	private Double taxajuros;	
	
	//Constructor
	public ContaPoupanca(Integer numero, String nomeCliente, Double saldo, Double taxajuros) {
		super(numero, nomeCliente, saldo);
		this.taxajuros = taxajuros;
	}
	
	//Getters and Setters
	public void saque(Double valor) {
		Scanner input = new Scanner(System.in);
		while (true){
			try {
				if(valor <= this.getSaldo()){
					System.out.println("Saldo atual: R$"+this.getSaldo());
					this.setSaldo(this.getSaldo()- valor);
					System.out.println("Saque realizado com sucesso");
					System.out.println("Novo saldo: R$"+this.getSaldo());
					break;
					}else {
					System.out.println("Não é possivel fazer um saque maior que o saldo da conta");
					System.out.println("Digite novamente um valor para sacar e 0 para sair: R$");
					Double nvalor = input.nextDouble();
					if( nvalor  == 0) {
						System.out.println("Saindo...");
						break;
					}
					else {
						valor = nvalor;	
					}						
					
				}
				
			}catch(Exception erro){
				System.out.println("Erro: "+ erro);
			}
			
		}		
		
	}
	public void renderJuros() {
		System.err.println("Os juros rendem "+this.getTaxajuros()+"%");
		System.out.println("Sado atual: R$"+this.getSaldo());
		this.setSaldo(this.getSaldo()+(this.getTaxajuros()*100)/this.getSaldo());
		System.out.println("Novo saldo: R$"+this.getSaldo());
	}

	public Double getTaxajuros() {
		return taxajuros;
	}

	public void setTaxajuros(Double taxajuros) {
		this.taxajuros = taxajuros;
	}
	
}
