package br.edu.infnet.alicesilva;

import java.util.Map;
import java.util.HashMap;

public class Turma {
	private int codigo;
	private Map<Integer, String> alunos;
	private int qtdAlunos;
	private Professor professor;
	private Disciplina disciplina;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Turma(int codigo) {
		this.codigo = codigo;
		this.alunos = new HashMap<>();
	}
	
	public Turma(int codigo, Professor professor, Disciplina disciplina) {
		this.codigo = codigo;
		this.professor = professor;
		this.disciplina = disciplina;
		this.alunos = new HashMap<>(); 
	}
	
	@Override
    public String toString() {
		return "Código da turma: " + codigo; 
	}
	
	public String addAluno(int matricula, String nome) {
        if (alunos.size() >= 50) {
            return "Turma cheia";
        } else {
            alunos.put(matricula, nome);
            qtdAlunos++;
            return "Aluno adicionado";
        }
    }
	
	public boolean abrirTurma(){
		return qtdAlunos >= 10 && qtdAlunos <= 50;
	}
	
	public String listarAlunos() {
	    StringBuilder listaAlunos = new StringBuilder();
	    for (String nome : alunos.values()) {
	        listaAlunos.append("Aluno: ").append(nome).append("\n");
	    }
	    return listaAlunos.toString();
	}
	 
	public String gerarPauta() {
		return " - Código da turma: " + codigo + " - Nome da disciplina: " + disciplina.getNome() + " - Nome do professor: " + professor.getNome() + " - Lista de alunos: " + listarAlunos();
	}
	
}
