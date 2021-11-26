package Entidade;

import java.util.ArrayList;

public class Turma {
    ArrayList<Aluno> alunos = new ArrayList<>();
    //    ArrayList<Atividades> atividades = new ArrayList<>();
    ArrayList<Atividades> atvDevolvidas = new ArrayList<>();
    private String nome;
    private String semestre;

    public ArrayList<Atividades> getAtvDevolvidas() {
        return atvDevolvidas;
    }

    public String getNome() {
        return nome;
    }

    public void devolverAtividade(Atividades atv) {
        atvDevolvidas.add(atv);
    }

    public void addAtividadeAlunos(Atividades newAtv) {
//        atividades.add(newAtv);
        for (Aluno a : alunos) {
            newAtv.setAluno(a);
            a.entregarAtividade(newAtv);
        }
        //remove atividades do array da turma, pq ja foi atribuido ao aluno
//        atividades.remove(newAtv);

    }

    public void mostrarAtividades() {
        for (var a : atvDevolvidas) {
            System.out.println(a);
        }
    }

    public Turma(String semestre, String nome) {
        this.semestre = semestre;
        this.nome = nome;
    }

    public void addAlunoTurma(Aluno aluno) {
        alunos.add(aluno);
    }

    public void mostrarAlunosSemestre() {
        for (var a : alunos) {
            System.out.println(a.getNome() + " - " + a.getCurso().getNome());
        }
    }
}
