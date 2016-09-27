package exercicio_313;

public class Invoice {
	private String numero;
	private String descricao;
	private int quantidade;
	private double precoItem;
	
	public Invoice(String numero, String descricao, int quantidade, double precoItem) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.precoItem = precoItem;
		
	}
	
	public double getInvoiceAmount (int quantidade, double precoItem){
		if (quantidade < 0){
			quantidade = 0;
		}
		if (precoItem < 0){
			precoItem = 0;
		}
		double precoTotal = (quantidade * precoItem);
		return precoTotal;
	}
	

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}
	
}
