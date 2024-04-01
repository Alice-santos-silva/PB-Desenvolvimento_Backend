package br.edu.infnet.alicesilva;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private List<Aluno> alunos;
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
        this.alunos = new ArrayList<>();
    }

    public Turma(int codigo, Professor professor, Disciplina disciplina) {
        this.codigo = codigo;
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Código da turma: " + codigo;
    }

    public String addAluno(Aluno aluno) {
        if (alunos.size() >= 50) {
            return "Turma cheia";
        } else {
            alunos.add(aluno);
            return "Aluno adicionado";
        }
    }

    public boolean abrirTurma() {
        return alunos.size() >= 10 && alunos.size() <= 50;
    }

    public String listarAlunos() {
        StringBuilder listaAlunos = new StringBuilder();
        for (Aluno aluno : alunos) {
            listaAlunos.append("Aluno: ").append(aluno.getNome()).append("\n");
        }
        return listaAlunos.toString();
    }

    public String gerarPauta() {
        return " - Código da turma: " + codigo + " - Nome da disciplina: " + disciplina.getNome() + " - Nome do professor: " + professor.getNome() + " - Lista de alunos: \n" + listarAlunos();
    }
}
