package Arrays;

public class Arrays06 {
    public static void main(String[] args) {
        /*
        Criando arrays de objetos
        */
        Turma turmaB = new Turma();
        turmaB.identificacao = "Martenal B";
        turmaB.nomeProfessor = "Tia Maria";
        turmaB.alunos = new Aluno[3];

        //atribuindo
        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].nome = "Mario";
        turmaB.alunos[0].idade = 8;

        //outra forma de Atribuir
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Kaio";
        aluno1.idade = 7;


        turmaB.alunos[1] = aluno1;

        turmaB.imprimirListaDeAlunos();

        /*for (int i = 0; i < turmaB.alunos.length; i++) {
            Aluno aluno = turmaB.alunos[i];
            if (aluno != null){
                System.out.printf("%d - %s (%d anos)%n", i, aluno.nome, aluno.idade);
            }else
                System.out.printf("%d - vagos%n", i);
        }
         */


    }
    public static class Aluno {
        String nome;
        int idade;
    }

    public static class Turma {
        String identificacao;
        String nomeProfessor;
        Aluno[] alunos; //poderia coloca = new Aluno[3];

        void imprimirListaDeAlunos() {

            for(Aluno  aluno : alunos) {  // nao tem acesso ao indexe
                if (aluno != null) {
                    System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
                }else{
                    System.out.println("vago");
                }

            }
        }
    }
}
