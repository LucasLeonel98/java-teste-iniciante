package Entity;

public class ContaTerminal {
	private int numero;
	private String agencia;
	private String nomeCliente;
	private String sobrenome;
	private Double saldo;
	
	public String getNome() {
		return this.nomeCliente;
	}
	
	public void setNome(String nome) {
		 this.nomeCliente = nome;
	}
	
	public String getSobreNome() {
		return this.sobrenome;
	}
	
	public void setSobreNome(String sobrenome) {
		 this.sobrenome = sobrenome;
	}
	public String getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(String agencia) {
		 this.agencia = agencia;
	}
		
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		 this.numero = numero;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(Double saldo) {
		 this.saldo = saldo;
	}
}
