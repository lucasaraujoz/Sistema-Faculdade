package Entidade;

import java.util.ArrayList;

public class Curso {
    ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private String nome;
    private String codigo;

    public Curso(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void addDisciplinaCuros(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public String getNome() {
        return nome;
    }
}
