package Servico;

import Entidade.Aluno;
import Entidade.Curso;
import Entidade.Professor;
import Entidade.Turma;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicoAluno {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Turma> turmas = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void addProfessor(Professor professor) {
        professores.add(professor);
    }

    public void addTurma(Turma turma) {
        turmas.add(turma);
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }

    public Aluno escolherALuno() {
        int cont = 0, opc = -1;
        Aluno aluno;
        Scanner input = new Scanner(System.in);
        for (Aluno a : alunos) {
            System.out.println(cont + " - " + a.getNome());
            cont++;
        }
        System.out.println("Escolha:");
        opc = input.nextInt();
        aluno = alunos.get(opc);
        return aluno;
    }
}
