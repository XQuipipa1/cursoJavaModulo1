package com.quipipa.cursojava.aula40;

public class Professor extends Pessoa {
	private String departamento;
	private String nomeCurso;
	private double salario;
	
	
	public Professor(){}
	
	
	
	public Professor(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone, cpf);
		// TODO Auto-generated constructor stub
	}



	public Professor(String departamento, String nomeCurso, double salario) {
		super();
		this.departamento = departamento;
		this.nomeCurso = nomeCurso;
		this.salario = salario;
		
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public double calcularSalarioLiquido() {
		
		return 0;
		
	}
	
	public String obterEtiquetaEndereco() {
		String s = "O enderenco do Professor: " + this.getEndereco();
		return s;
	}
	

}