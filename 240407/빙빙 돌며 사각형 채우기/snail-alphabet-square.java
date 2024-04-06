import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};

    static char[][] map;
    static int N, M, r = 0, c = 0, dir = 0;
    static StringBuilder result = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
        } catch (Exception e) {
            e.printStackTrace();
        }

        map = new char[N][M];
        map[r][c] = 'A';

        int start = 1;
        while (start < N * M) {

            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (!inRange(nr, nc) || Character.isLetter(map[nr][nc])) {
                dir = (dir + 1) % 4;
            }

            r = r + dr[dir];
            c = c + dc[dir];
            map[r][c] = (char) ('A' + start++);
        }

        for (char[] row : map) {
            for (char col : row) {
                result.append(col).append(" ");
            }
            result.append("\n");
        }
        System.out.print(result);
    }

    static boolean inRange(int r, int c) {
        return 0 <= r && r < N && 0 <= c && c < M;
    }
}