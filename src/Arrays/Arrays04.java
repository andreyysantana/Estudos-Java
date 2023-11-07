package Arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        /*
        Transformando arrays em representações em string
         */
        int[] notas = {8,6,5,2,9};

        String notasEmString = Arrays.toString(notas);
        System.out.println(notasEmString);
    }
}
