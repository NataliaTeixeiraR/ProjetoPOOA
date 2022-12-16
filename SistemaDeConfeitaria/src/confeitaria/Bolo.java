package confeitaria;

public class Bolo {
	
	/* Atributos */ 
	
	protected String sabor;
	protected String descricao;	
	protected double preco;
	protected double precoMassa;
	
	public Bolo (String s, String d, double p) {
		this.sabor = s;
		this.descricao = d; 
		this.preco = p;		
	}
	
	public String toString() {
		return "Sabor: " + this.sabor + ", Descrição: " + this.descricao + ", Preço: " + this.preco;
	}
	
	/* Método para a aplicação de sobreposição */ 
	
	public void desconto() {
		this.preco*=1;
	}
	
	/* Método para a aplicação de sobrecarga */ 
	
	
	public void precoTotal(double precoMassa, double precoCobertura, double precoRecheio) {
		preco = precoMassa + precoCobertura + precoRecheio;
	}	
	
	public void precoTotal(double precoMassa, double precoCobertura) {
		preco = precoMassa + precoCobertura;
	}
	
	public void precoTotal(double precoMassa) {
		preco = precoMassa;
	}
	
	/* Métodos acessores */ 
	
	public String getSabor() {
		return sabor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public double getPrecoMassa() {
		return precoMassa;
	}
	
	/* Métodos modificadores */ 
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setPrecoMassa(double precoMassa) {
		this.precoMassa = precoMassa;
	}	

}
