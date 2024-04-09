import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M, result = Integer.MIN_VALUE;
    static int[][] grid;
    static StringTokenizer st;

    static int[][][] shapes = new int[][][]{
        {{1, 1, 0},
        {1, 0, 0},
        {0, 0, 0}},
    
        {{1, 1, 0},
        {0, 1, 0},
        {0, 0, 0}},
    
        {{1, 0, 0},
        {1, 1, 0},
        {0, 0, 0}},
    
        {{0, 1, 0},
        {1, 1, 0},
        {0, 0, 0}},
    
        {{1, 1, 1},
        {0, 0, 0},
        {0, 0, 0}},
    
        {{1, 0, 0},
        {1, 0, 0},
        {1, 0, 0}},
    };

    static int getMaxSumInArea(int curRow, int curCol) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) {
            boolean isValid= true;
            int sum = 0;
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    if (shapes[i][r][c] == 0) {
                        continue;
                    }
                    if (!inRange(r + curRow, c + curCol)) {
                        isValid = false;
                    } else {
                        sum += grid[r + curRow][c + curCol];
                    }
                }

                if (isValid) {
                    max = Math.max(max, sum);
                }
            }
         }

         return max;
    }

    static boolean inRange(int r, int c) {
        return 0 <= r && r < N && 0 <= c && c < M;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        grid = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                result = Math.max(result, getMaxSumInArea(r, c));
            }
        }

        System.out.print(result);
    }
}