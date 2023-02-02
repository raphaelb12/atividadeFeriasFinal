package Questao3;

public class Questao3 {
    public static final int[] X = { 2, 1, -1, -2, -2, -1, 1, 2 };
    public static final int[] Y = { 1, 2, 2, 1, -1, -2, -2, -1 };

    public double is_knight_on_board(int b, int k, int l, int c) {
        double[][] v = new double[b][b];
        v[l][c] = 1;
        for (int i = 0; i < k; i++) {
            double[][] pk = new double[b][b];
            for (int x = 0; x < b; x++) {
                for (int y = 0; y < b; y++) {
                    if (v[x][y] == 0){
                        continue;
                    }
                    for (int j = 0; j < 8; j++) {
                        int px = x + X[j];
                        int py = y + Y[j];
                        if(px<0||px>=b||py<0||py>=b) {
                            continue;
                        }
                        pk[px][py] += v[x][y] /8.0;
                    }
                }
            }
            v = pk;
        }

        double prob = 0;
        for (int x = 0; x < b; x++) {
            for (int y = 0; y < b; y++) {
                prob += v[x][y];
            }
        }
        return prob;


    }


}
