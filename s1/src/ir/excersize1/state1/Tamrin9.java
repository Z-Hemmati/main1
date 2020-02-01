package ir.excersize1.state1;

public class Tamrin9 {
    public static void main(String[] args) {
        int str[][][] = new int[3][4][5];
        int i, j, k, p = 1;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    str[i][j][k] = k + i + j + p;
                    p++;
                }
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.println(str[i][j][k]);
                }
            }

        }
    }
}
