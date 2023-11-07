package Arrays;

public class Arrays08 {
    public static void main(String[] args) {
        /*
        copiando e expandindo o Arrays
         */
        int[] numeroJogo1 = {25,53,2,41,5,60};
        int[] numeroJogo2 = java.util.Arrays.copyOf(numeroJogo1,numeroJogo1.length + 1);// pode expandir tambem copyOf
        numeroJogo2[numeroJogo1.length - 1] = 44;

        System.out.println(numeroJogo1);
        System.out.println(numeroJogo2);

    }
}
