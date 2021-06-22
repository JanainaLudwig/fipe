package br.edu.utfpr.dv.fipe;

public class Modelo {

	private int codigo;
	private String nome;
	
	public Modelo() {
		this.setCodigo(0);
		this.setNome("");
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString() {
		return this.getNome();
	}
	
}
