package Arrays;

public class Arrays10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[6];

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n------------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n------------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 30;

        dias[1][0] = 31;
        dias[1][1] = 30;
        dias[1][2] = 31;

        dias[2][0] = 30;
        dias[2][1] = 31;
        dias[2][2] = 30;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("---------------");
        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
