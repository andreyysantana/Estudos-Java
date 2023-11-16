package Arrays;

import java.util.Scanner;

public class ArraysExercicos {
    public static void main(String[] args) {
        int[] list = {12,32,54,65,75,13,24,97,13,75,65,87};
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira posição: ");
        int listaA = sc.nextInt();
        System.out.print("Digite a segunda posição: ");
        int listaB = sc.nextInt();

        int resultado = list[listaA] + list[listaB];

        System.out.println(resultado);
        }
}
