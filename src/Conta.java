
public class Conta {
	
	private Integer numero;
	private String nomeCliente;
	private Double saldo;
	
	//Constructor
	public Conta(Integer numero, String nomeCliente, Double saldo) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public void depositar(Double valor) {
		this.setSaldo(this.getSaldo()+ valor);
		
	}
	
	public void saque(Double valor) {
		this.setSaldo(this.getSaldo()- valor);
		
	}
	
	
	//Getters and Setters
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
