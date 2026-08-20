package model;

public class cliente {

	private String nome;
	private int qtd;
	private float valorPecas;
	
	public cliente() {
		this.nome = "";
		this.qtd = 0;
		this.valorPecas =0;
	}
	
	public cliente(String nome, int qtd, float vp) {
		this.nome= nome;
		this.qtd = qtd;
		this.valorPecas = vp;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
		
	}
	
	public int getQtd() {
		return this.qtd;
	}
	
	public float getvalorPecas() {
		return this.valorPecas;
	}
	

	public String toString() {
		return "Cliente [nome = "+ nome+ ", Quantidade de Peças = " +qtd + " Valor da peça = " + valorPecas + "]";
	}
}	
