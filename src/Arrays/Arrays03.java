package Arrays;

public class Arrays03 {

    /*
    Percorrendo os Arrays
     */
    public static void main(String[] args) {
        int[] notas = {8,6,5,4,7};

        double media = ArraysCalculadora03.calcularMedia(notas);
        System.out.println(media);
    }

    public static class ArraysCalculadora03 {
        static double calcularMedia(int[] numeros){
            /*
            Percorrendo os Arrays e Iterando em
            */
            int total = 0;
            /*
            for (int numero : numeros) {
            total += numeros;   // usado quando vc nao precisa do indice
            }
             */

            for (int i = 0; i < numeros.length; i++) {
                total += numeros[i];
            //quando vc precisa do indice
            }
            return (double) total / numeros.length;
        }
    }
}
