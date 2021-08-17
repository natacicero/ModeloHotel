package ModeloHotel;

public class Hospede {
	
	private String nome;
	private String rg;
	private String cpf;
	private String reserva;
	private String formaDePagamento;
	private double numeroDoQuarto;
	
	public Hospede (String nome,String rg,String cpf,String reserva,String formaDePagamento,double numeroDoQuarto) {
		super();
		this.nome= nome;
		this.rg= rg;
		this.cpf= cpf;
		this.reserva= reserva;
		this.formaDePagamento= formaDePagamento;
		this.numeroDoQuarto= numeroDoQuarto;
		
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getReserva() {
		return reserva;
	}

	public void setReserva(String reserva) {
		this.reserva = reserva;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public double getNumeroDoQuarto() {
		return numeroDoQuarto;
	}

	public void setNumeroDoQuarto(double numeroDoQuarto) {
		this.numeroDoQuarto = numeroDoQuarto;
	}

}
