package com.quipipa.cursojava.aula37;

public class Aluno extends Pessoa{
	
	private String[] cursos;
	private String[][] notas;
	
	
	
	public Aluno() {
		super();
	}
	
	public Aluno(String[] cursos, String[][] notas) {
		super();
		this.cursos = cursos;
		this.notas = notas;
	}
	public String[] getCursos() {
		return cursos;
	}
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	public String[][] getNotas() {
		return notas;
	}
	public void setNotas(String[][] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		
		return 0;
		
	}
	
	public double  verificarAprovado() {
		return 0;
		
	}

}
