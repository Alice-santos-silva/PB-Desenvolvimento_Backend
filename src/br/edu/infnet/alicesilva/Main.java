package br.edu.infnet.alicesilva;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor(12345, "Professor João");
		Disciplina disciplina = new Disciplina(9876, "PB");
		Turma turmateste = new Turma(2024, professor, disciplina);
		System.out.println(turmateste);
		System.out.println("É possível abrir turma agora? " + turmateste.abrirTurma());
		
		Aluno aluno1 = new Aluno(001, "Alice Santos");
		Aluno aluno2 = new Aluno(002, "Gabriel Souza");
		Aluno aluno3 = new Aluno(003, "Henrique Santos");
		Aluno aluno4 = new Aluno(004, "aluno4");
		Aluno aluno5 = new Aluno(005, "aluno5");
		Aluno aluno6 = new Aluno(006, "aluno6");
		Aluno aluno7 = new Aluno(007, "aluno7");
		Aluno aluno8 = new Aluno(8, "aluno8");
		Aluno aluno9 = new Aluno(9, "aluno9");
		Aluno aluno10 = new Aluno(010, "aluno10");

		turmateste.addAluno(aluno1.getMatricula(), aluno1.getNome());
		turmateste.addAluno(aluno2.getMatricula(), aluno2.getNome());
		turmateste.addAluno(aluno3.getMatricula(), aluno3.getNome());
		turmateste.addAluno(aluno4.getMatricula(), aluno4.getNome());
		turmateste.addAluno(aluno5.getMatricula(), aluno5.getNome());
		turmateste.addAluno(aluno6.getMatricula(), aluno6.getNome());
		turmateste.addAluno(aluno7.getMatricula(), aluno7.getNome());
		turmateste.addAluno(aluno8.getMatricula(), aluno8.getNome());
		turmateste.addAluno(aluno9.getMatricula(), aluno9.getNome());
		turmateste.addAluno(aluno10.getMatricula(), aluno10.getNome());
		
		System.out.println("É possível abrir turma agora? " + turmateste.abrirTurma());
		System.out.println("Pauta da turma: " + turmateste.gerarPauta());
	}

}
