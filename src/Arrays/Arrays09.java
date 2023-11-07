package Arrays;

public class Arrays09 {
    public static void main(String[] args) {
        /*
        Arrays multidimensionais
        */
        String[][] todasCidades = new String[3][3];

        todasCidades[0] = new String[3]; //definindo numeros de indece, assim removendo null
        todasCidades[0][0] = "Umberlandia";
        todasCidades[0][1] = "Uberaba";
        todasCidades[0][2] = "Belo Horizonte";

        todasCidades[1] = new String[2];
        todasCidades[1][0] = "São Paulo";
        todasCidades[1][1] = "Ribeirão Preto";

        todasCidades[2] = new String[1];
        todasCidades[2][0] ="Fortaleza";

        /*for (int i = 0; i < todasCidades.length; i++) {
            System.out.println(Arrays.toString(todasCidades[i]));
         */
        /*for (int i = 0; i < todasCidades.length; i++) {
            for (int j = 0; j < todasCidades.length; j++) {
                System.out.printf("[%d][%d] = %s%n", i, j, todasCidades[i][j]);
            }
         */
            for (String[] cidadesPorEstados : todasCidades) {
                for (String cidade :cidadesPorEstados) {
                    System.out.println(cidade);   //Para cada dimenção tem que ter um for
                }

            }
    }
}
