package br.edu.infnet.alicesilva;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int matricula;
    private String nome;
    private List<Turma> turmas;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.turmas = new ArrayList<>();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void addTurma(Turma turma) {
        turmas.add(turma);
        turma.addAluno(this);
    }

    public void exibirTurmas() {
        System.out.println("Turmas de " + nome + ":");
        for (Turma turma : turmas) {
            System.out.println(turma);
        }
    }
}
