package exemplo01;

public class Produto {
	
	private String nomeProduto;
	private int quantidadeProduto;
	private double valorProduto;
	
	public Produto(String nomeProduto, int quantidadeProduto, double valorProduto){
		this.nomeProduto = nomeProduto;
		this.quantidadeProduto = quantidadeProduto;
		this.valorProduto = valorProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	
	
	

}
