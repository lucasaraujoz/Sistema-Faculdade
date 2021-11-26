package Entidade;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Pessoa {
    private Curso curso;
    private ArrayList<Atividades> atvRecebidas = new ArrayList<>();

    public Aluno(String nome, String codigo, String mail, String cpf, Curso curso) {
        super(nome, codigo, mail, cpf);
        this.curso = curso;
    }

    public void entregarAtividade(Atividades atv) {
        this.atvRecebidas.add(atv);
    }

    public void devolverAtividade() {
        Atividades atvDelv;
        int opc = -1;
        Scanner input = new Scanner(System.in);
        mostrarAtividadesAluno();
        opc = input.nextInt();
        System.out.println("Escolha a atividade a devolver:");
        atvDelv = atvRecebidas.get(opc);
        atvDelv.devolverAtividade(atvDelv);
        atvRecebidas.remove(atvDelv);
        // escolher turma certa da atividade e devolver pra arraylist devolvidas
    }

    public void mostrarAtividadesAluno() {
        int cont = 0;
        for (Atividades a : atvRecebidas) {
            System.out.println(cont + " - " + a.getNome() + " -- " + a.getTurma().getNome());
            cont++;
        }
    }
    public Curso getCurso() {
        return curso;
    }
}
