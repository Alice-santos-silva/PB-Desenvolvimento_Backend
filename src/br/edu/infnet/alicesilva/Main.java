package br.edu.infnet.alicesilva;

public class Main {

    public static void main(String[] args) {
        // Criar professor e disciplina
        Professor professor = new Professor(12345, "Professor João");
        Disciplina disciplina = new Disciplina(9876, "PB");
        
        // Criar turma
        Turma turma1 = new Turma(2024, professor, disciplina);

        // Criar alunos
        Aluno aluno1 = new Aluno(1, "Alice Santos");
        Aluno aluno2 = new Aluno(2, "Gabriel Souza");
        Aluno aluno3 = new Aluno(3, "Henrique Santos");
        Aluno aluno4 = new Aluno(4, "Aluno 4");
        Aluno aluno5 = new Aluno(5, "Aluno 5");
        Aluno aluno6 = new Aluno(6, "Aluno 6");
        Aluno aluno7 = new Aluno(7, "Aluno 7");
        Aluno aluno8 = new Aluno(8, "Aluno 8");
        Aluno aluno9 = new Aluno(9, "Aluno 9");
        Aluno aluno10 = new Aluno(10, "Aluno 10");

        // Adicionar alunos à turma
        turma1.addAluno(aluno1);
        turma1.addAluno(aluno2);
        turma1.addAluno(aluno3);
        turma1.addAluno(aluno4);
        turma1.addAluno(aluno5);
        turma1.addAluno(aluno6);
        turma1.addAluno(aluno7);
        turma1.addAluno(aluno8);
        turma1.addAluno(aluno9);
        turma1.addAluno(aluno10);
        
        // Verificar se a turma pode ser aberta
        System.out.println("(Método abrirTurma) É possível abrir turma agora? " + turma1.abrirTurma());
        
        // Exibir a pauta da turma
        System.out.println("(Método gerarPauta) Pauta da turma: " + turma1.gerarPauta());
        
        aluno1.addTurma(turma1);
        aluno2.addTurma(turma1);
        aluno3.addTurma(turma1);
        aluno4.addTurma(turma1);
        aluno5.addTurma(turma1);
        aluno6.addTurma(turma1);
        aluno7.addTurma(turma1);
        aluno8.addTurma(turma1);
        aluno9.addTurma(turma1);
        aluno10.addTurma(turma1);
        
        aluno1.exibirTurmas();
        aluno2.exibirTurmas();
        aluno3.exibirTurmas();
        aluno4.exibirTurmas();
        aluno5.exibirTurmas();
        aluno6.exibirTurmas();
        aluno7.exibirTurmas();
        aluno8.exibirTurmas();
        aluno9.exibirTurmas();
        aluno10.exibirTurmas();
    }
}

