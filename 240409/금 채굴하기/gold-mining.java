import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M, result = Integer.MIN_VALUE;
    static int[][] grid;
    static int[] dr = {1, 1, -1, -1};
    static int[] dc = {-1, 1, 1, -1};
    static StringTokenizer st;

    static int simulate(int r, int c) {
        int maxGold = grid[r][c]; 
        int totalGold = grid[r][c]; 

        for (int k = 1; k <= 2 * (N - 1); k++) {
            int goldCount = 0;
            int operationCost = k * k + (k + 1) * (k + 1);
            int nr = r - k, nc = c;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < k; j++) {
                    nr += dr[i];
                    nc += dc[i];
                    if (inRange(nr, nc)) {
                        goldCount += grid[nr][nc];
                    }
                }
            }
            totalGold += goldCount;
            if (totalGold * M >= operationCost) {
                maxGold = Math.max(maxGold, totalGold);
            }
        }

        return maxGold;
    }


    static boolean inRange(int r, int c) {
        return 0 <= r && r < N && 0 <= c && c < N;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N =Integer.parseInt(st.nextToken());
        M =Integer.parseInt(st.nextToken());

        grid = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                result = Math.max(result, simulate(r, c));
            }
        }

        System.out.print(result);
    }
}