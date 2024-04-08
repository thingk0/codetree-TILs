import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M, result = 0;
    static int[][] map;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            checkRow(i);
            checkColumn(i);
        }

        System.out.print(result);
    }


    static void checkRow(int row) {
        int count = 1;
        for (int i = 1; i < N; i++) {
            if (map[row][i] == map[row][i - 1]) {
                count++;
                if (count >= M) {
                    result++;
                    break;
                }
            } else {
                count = 1;
            }
        }
    }

    static void checkColumn(int column) {
        int count = 1;
        for (int i = 1; i < N; i++) {
            if (map[i][column] == map[i - 1][column]) {
                count++;
                if (count >= M) {
                    result++;
                    break;
                }
            } else {
                count = 1;
            }
        }
    }
}