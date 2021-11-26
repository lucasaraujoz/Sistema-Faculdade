package Entidade;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Pessoa {
    private Curso curso;
    private ArrayList<Turma> turmas = new ArrayList<>();
    private ArrayList<Atividades> atvRecebidas = new ArrayList<>();
    private ArrayList<Atividades> atvPontuadas = new ArrayList<>();

    public Aluno(String nome, String codigo, String mail, String cpf, Curso curso) {
        super(nome, codigo, mail, cpf);
        this.curso = curso;
    }
    public void entregarAtividade(Atividades atv) {
        //verificar
        atvRecebidas.add(atv);
    }

    public void devolverAtividade() {
        Atividades atvDelv;
        int opc = -1;
        Scanner input = new Scanner(System.in);
        mostrarAtividadesAluno();
        System.out.println("Escolha a atividade a devolver:");
        opc = input.nextInt();
        atvDelv = atvRecebidas.get(opc);
        atvDelv.devolverAtividade(atvDelv);
//        atvRecebidas.remove(atvDelv); // remove a atividade da conta do aluno e deixa em devolvidas na turma com a asinatur ado aluno
        // escolher turma certa da atividade e devolver pra arraylist devolvidas

    }

    public void mostrarAtividadesAluno() {
        int cont = 0;
        for (var a : atvRecebidas) {
            System.out.println(cont + " - " + a.getNome() + " -- " + a.getTurma());
            cont++;
        }
    }
    public void mostrarAtividadesConcluidas() {
        int cont = 0;
        for (var a : atvPontuadas) {
            System.out.println(cont + " - " + a.getNome() + " -- " + a.getTurma());
            cont++;
        }
    }

    public void concluirAtividade(Atividades atv){
        atvPontuadas.add(atv);
    }
    public Curso getCurso() {
        return curso;
    }
}
