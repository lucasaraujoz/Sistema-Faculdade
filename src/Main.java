import Entidade.*;
import Servico.ServicoAluno;
import Servico.ServicoProfessor;

import java.util.Scanner;

public class Main {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Curso quimicaIndustrial = new Curso("Quimica Industrial", "depaQui01");
        Turma fisicoQui = new Turma("20212", "FisicoQuimica");

//        fisicoQui.addAlunoTurma(new Aluno("Jorgina", "asd", "zcxzc", "20324", quimicaIndustrial));
//        Aluno robert = new Aluno("Robert", "sss", "a", "s", quimicaIndustrial);
//        Professor Hamilton = new Professor("Ham", "s", "a", "a", "qq");
//        Hamilton.addTurmaProfessor(fisicoQui);
//        robert.addTurmaAluno(fisicoQui); //a turma é so do aluno
//
//        fisicoQui.addAlunoTurma(robert);
//        //add atividade turma
//        fisicoQui.mostrarAlunosSemestre();
//        fisicoQui.mostrarAtividades();
//        System.out.println("----");
//        Hamilton.atribuirAtividadeTurma(fisicoQui, new Atividades("Lista 1", 10, false));
////        robert.mostrarAtividadesAluno();
//        System.out.println("----");
//        robert.devolverAtividade();
//        fisicoQui.mostrarAtividades();
//        Hamilton.darNotaAlunos();

        Scanner input = new Scanner(System.in);
        ServicoAluno allAlunos = new ServicoAluno();
        ServicoProfessor allProfessores = new ServicoProfessor();
        String nome;
        int opc = -1;

        clearScreen();
        while (opc!=999) {
            System.out.println("1 - Area Aluno");
            System.out.println("2 - Area Professor");
            System.out.println("3 - Criar Professor");
            System.out.println("4 - Criar Aluno");
            opc = input.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("break");
                    Aluno aluno = allAlunos.escolherALuno();
                    //ver atividades atribuidas
                    System.out.println("1 - Atividades atribuidas");
                    System.out.println("2 - Devolver atividade x");
                    switch (opc){
                        case 1:
                            aluno.mostrarAtividadesAluno();
                            break;
                        case 2:
                            aluno.devolverAtividade();
                            break;
                    }
                    clearScreen();
                    break;
                case 2:
                    Professor prof = allProfessores.escolherProfessor();
                    // add em turma
                    opc = input.nextInt();
                    System.out.println("1 - Atribui nova atividade pra turma x:");
                    System.out.println("2 - Corrigir atividades da turma x:");
                    switch (opc){
                        case 1: // atribuir atividade a turma x
                            System.out.println("Nome da atividade ");
                            nome = input.next();
                            Atividades novaAtv = new Atividades(nome,0,false);
                            prof.atribuirAtividadeTurma(fisicoQui,novaAtv);
                            System.out.println("Atribuido a todos");
                            break;
                        case 2:
                            prof.darNotaAlunos();
                    }
                    // add atividade em turma
                    // corrigir atividades devolvidas da turma x
                    clearScreen();
                    break;
                case 3: // adicionar professor
                    System.out.println("Insira o nome do novo professor:");
                    nome = input.next();
                    Professor novoProf = new Professor(nome, "002", "bla@g.c", "003", "DCET");
                    allProfessores.addProfessor(novoProf);
                    novoProf.addTurmaProfessor(fisicoQui);
                    clearScreen();
                    break;
                case 4: // adicionar aluno
                    System.out.println("Insira o nome do novo aluno:");
                    nome = input.next();
                    Aluno alun = new Aluno(nome, "001", "bla@g.c", "003", quimicaIndustrial);
                    allAlunos.addAluno(alun);
                    fisicoQui.addAlunoTurma(alun);
                    clearScreen();
                    break;
                case 5: //criar turma
                    break;
                case 6: // criar curso
                    break;
                case 7: // sistema ex: adiciona aluno em uma turma
                    break;

            }
        }
    }
}
