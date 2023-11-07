package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {
        /*
        Ordenando arrays em ordem natural e reversa
         */
        int[] notas = {8,6,3,7,8};
        Arrays.sort(notas);// ordem cresente

        Integer[] notas2 = {8,6,3,7,8};
        Arrays.sort(notas2, Comparator.reverseOrder()); //ordem decresente, nao aceita primitivo dessa forma
    }
}
