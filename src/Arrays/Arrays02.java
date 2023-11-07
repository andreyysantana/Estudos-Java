package Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        /*
        Acessando e Atribuindo elemento de Arrays
         */
        int[] notas = {8, 5, 6, 7, 9};

        //Atribuindo novo valores a indice [0] e [2]
        notas[0] = 10;
        notas[2] = 2;

        //Acessando os arrays
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[3]);

        int totalNotas = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
        System.out.println(totalNotas);
    }
}
