  public class estoque {
  	private String nome;
  	private int qtdAtual, qtdMinima;
  	
  	
  	public estoque(String nome, int qtdAtual, int qtdMinima) {
  		this.nome = nome;
  		this.qtdAtual = qtdAtual;
  		this.qtdMinima = qtdMinima;
  	}	
  	public estoque() {
      
  	}	
  	public void darBaixa(int qtde) {
  		if(this.qtdAtual > qtde) {
  			this.qtdAtual -= qtde;
  		}else 
        System.out.println("Estoque não pode ficar negativo");		
  	}
  	public String Mostra () {
  		return "O produto " + this.nome + " possui a quantidade mínima: " + this.qtdMinima + ", e sua quantidade atual é: " + this.qtdAtual ;
  	}	
  	public boolean precisaRepor() {	
  		if(this.qtdAtual<= this.qtdMinima) {
  			return true;
  		}else 
        return false;
  	}	
  	public String getNome() {
  		return nome;
  	}
  	private void setNome(String nome) {
  		this.nome = nome;
  	}
  	public int getQtdAtual() {
  		return qtdAtual;
  	}
  	private void setQtdAtual(int qtdAtual) {
  		this.qtdAtual = qtdAtual;
  	}
  	public int getQtdMinima() {
  		return qtdMinima;
  	}
  	private void setQtdMinima(int qtdMinima) {
  		this.qtdMinima = qtdMinima;
  	}	
  }