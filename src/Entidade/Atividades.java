package Entidade;

public class Atividades {
    private String nome;
    private int nota;
    private boolean feito;
    private Turma turma;
    private Aluno aluno;


    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public Atividades(String nome, int nota, boolean feito) {
        this.nome = nome;
        this.nota = nota;
        this.feito = feito;
    }

    public void devolverAtividade(Atividades a) {
        this.turma.devolverAtividade(a);
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Turma getTurma() {
        return turma;
    }

    public String getNome() {
        return nome;
    }

}
