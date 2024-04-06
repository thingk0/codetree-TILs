import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M, dir = 0, r = 0, c = 0;
    static int[][] map;
    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, 1, 0, -1};
    static StringTokenizer st;

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            map = new int[N][M];

            int num = 1;
            map[r][c] = num;
            while (num < N * M) {
                int nr = r + dr[dir];
                int nc = c + dc[dir];

                if (!inRange(nr, nc) || map[nr][nc] != 0) {
                    dir = (dir + 1) % 4;
                }

                r = r + dr[dir];
                c = c + dc[dir];
                map[r][c] = ++num;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        StringBuilder result = new StringBuilder();
        for (int[] row : map) {
            for (int num : row) {
                result.append(num).append(" ");
            }
            result.append("\n");
        }

        System.out.print(result);
    }

    static boolean inRange(int r, int c) {
        return 0 <= r && r < N && 0 <= c && c < M;
    }
}