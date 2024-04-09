import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] grid;
    static int[] dr = {-1, -1, 1, 1};
    static int[] dc = {1, -1, -1, 1};
    static StringTokenizer st;

    static int simulate(int r, int c, int k, int l) {
        int sum = 0;
        int[] moveDis = {k, l, k, l};
        for (int dir = 0; dir < 4; dir++) {
            for (int dis = 0; dis < moveDis[dir]; dis++) {
                r += dr[dir];
                c += dc[dir];
                if (!inRange(r, c)) {
                    return 0;
                }
                sum += grid[r][c];
            }
        }
        return sum;
    }

    static boolean inRange(int r, int c) {
        return 0 <= r && r < N && 0 <= c && c < N;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        grid = new int[N][N];
        for (int r = 0; r < N; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < N; c++) {
                grid[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        int result = Integer.MIN_VALUE;
        for (int r = 2; r < N; r++) {
            for (int c = 1; c < N - 1; c++) {
                for (int k = 1; k < N; k++) {
                    for (int l = 1; l < N; l++) {
                        result = Math.max(result, simulate(r, c, k, l));
                    }
                }
            }
        }
        System.out.print(result);
    }
}