import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] grid;
    static int[] dr = {-1, -1, 1, 1};
    static int[] dc = {1, -1, -1, 1};

    static StringTokenizer st;

    static int simulate(int r, int c) {
        
        int max = Integer.MIN_VALUE;
        int dir = 0;
        int nr = r;
        int nc = c;

        for (int dis = 1; dis < N; dis++) {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                int l = 1;
                while (l++ <= dis) {
                    nr += dr[i];
                    nc += dc[i];
                    if (!inRange(nr, nc)) {
                        break;
                    }
                    sum += grid[nr][nc];
                }
            }
            max = Math.max(max, sum);
        }

        return max;
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
                result = Math.max(result, simulate(r, c));
            }
        }

        System.out.print(result);
    }
}