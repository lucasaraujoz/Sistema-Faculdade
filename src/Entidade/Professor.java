package Entidade;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Pessoa {
    private String departamento;

    private ArrayList<Turma> turmasProfessor = new ArrayList<>();

    public Professor(String nome, String codigo, String email, String cpf, String departamento) {
        super(nome, codigo, email, cpf);
        this.departamento = departamento;
    }

    public void addTurmaProfessor(Turma turma) {
        turmasProfessor.add(turma);
    }

    private Turma selecionarTurma() {
        int cont = 0, opc = -1;
        Turma a;
        Scanner input = new Scanner(System.in);
        for (Turma t : turmasProfessor) {
            System.out.println(cont + " -- " + t.getNome());
            cont++;
        }
        System.out.println("Escolha a turma:");
        opc = input.nextInt();
        a = turmasProfessor.get(opc);
        return a;
    }

    public void atribuirAtividadeTurma(Turma turma, Atividades atv) {
        Turma a = selecionarTurma();
        atv.setTurma(a); //seta turma na atividade
        a.addAtividadeAlunos(atv); //adiciona atividade para todos os alunos da turma selecionada
    }

    public void darNotaAlunos() {
        Turma a = selecionarTurma();
        int nota;
        Scanner input = new Scanner(System.in);
        var acorrigir = a.getAtvDevolvidas();
        if (acorrigir.size() > 0) {
            //dar nota e devolver atividades pra turma
            for (Atividades c : acorrigir) {
                System.out.println(c.getAluno().getNome() + "--" + c.getNome());
                System.out.println("Nota: ");
                nota = input.nextInt();
                c.setNota(nota);
            }
            for(Atividades c: acorrigir){
                System.out.println(c.getAluno() + " NOTA: " + c.getNota());;
            }
            //devolver notas corrigidas pra turma
        } else {
            System.out.println("Nao tem atividade pra corrigir");
        }
    }
}
