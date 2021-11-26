package Servico;

import Entidade.Aluno;
import Entidade.Curso;
import Entidade.Professor;
import Entidade.Turma;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicoProfessor {
    private ArrayList<Professor> professores = new ArrayList<>();

    public void addProfessor(Professor professor) {
        professores.add(professor);
    }

    public Professor escolherProfessor() {
        int cont = 0, opc = -1;
        Professor prof;
        Scanner input = new Scanner(System.in);
        for (Professor a : professores) {
            System.out.println(cont + " - " + a.getNome());
            cont++;
        }
        System.out.println("Escolha:");
        opc = input.nextInt();
        prof = professores.get(opc);
        return prof;
    }
}
