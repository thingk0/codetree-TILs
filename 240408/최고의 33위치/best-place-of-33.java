import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, result = Integer.MIN_VALUE;
    static int[][] map;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result = Math.max(result, countCoinInRange(i, j));
            }
        }

        System.out.print(result);
    }

    static int countCoinInRange(int r, int c) {
        int count = 0;
        for (int i = r; i <= r + 2; i++) {
            for (int j = c; j <= c + 2; j++) {
                if (inRange(i, j) && map[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }


    static boolean inRange(int r, int c) {
        return 0 <= r && r < N && 0 <= c && c < N;
    }
}