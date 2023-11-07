package Arrays;

import java.util.ArrayList;

public class Arrays07 {
    public static void main(String[] args) {
        /*
        Usando ArrayList para compara 06
         */
        Turma turmaB = new Turma();
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("João");
        alunos.add("Mario");
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Vinicios";
        aluno1.idade = 4;
        turmaB.adicionarAluno(aluno1);
        turmaB.imprimirListaDeAlunos();

        for (int i = 0; i < alunos.size(); i++) {
            String aluno = alunos.get(i);
            System.out.println(aluno);

        }
        for (String aluno : alunos) {
            System.out.println(aluno);
        }


        }
    public static class Aluno {
        String nome;
        int idade;
    }
    public static class Turma {
        String nomeProfessor;
        ArrayList<Aluno> alunos = new ArrayList<>();

        void adicionarAluno(Aluno aluno){
            alunos.add(aluno);
        }
        void removerAluno(int indice){
            alunos.remove(indice);
        }

        void imprimirListaDeAlunos() {
            for (Aluno aluno : alunos) {
                System.out.printf("%s (%d anos) %n", aluno.nome, aluno.idade);
            }
        }
    }
}
