import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, result = Integer.MIN_VALUE;
    static int[][] map;
    static int[][] prefixSum;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        prefixSum = new int[N+1][N+1];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                prefixSum[i+1][j+1] = prefixSum[i+1][j] + prefixSum[i][j+1] - prefixSum[i][j] + map[i][j];
            }
        }

        for (int i = 0; i <= N-3; i++) {
            for (int j = 0; j <= N-3; j++) {
                int coinCount = getSum(i, j, i+3, j+3);
                result = Math.max(result, coinCount);
            }
        }

        System.out.print(result);
    }

    static int getSum(int r1, int c1, int r2, int c2) {
        return prefixSum[r2][c2] - prefixSum[r2][c1] - prefixSum[r1][c2] + prefixSum[r1][c1];
    }
}