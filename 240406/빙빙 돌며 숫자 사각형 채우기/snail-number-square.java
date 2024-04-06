import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, m, d = 0, start = 1, cr = 0, cc = 0;
    static int[][] map;
    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
    static StringTokenizer st;

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            map = new int[n][m];
            map[cr][cc] = start;

            while (start < n * m) {

                int nr = cr + dr[d];
                int nc = cc + dc[d];

                if(!inRange(nr, nc) || map[nr][nc] != 0) {
                    d = (d + 1) % 4;
                }

                cr += dr[d];
                cc += dc[d];
                map[cr][cc] = ++start;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        StringBuilder result = new StringBuilder();
        for (int[] row : map) {
            for (int e : row) {
                result.append(e + " ");
            }
            result.append("\n");
        }

        System.out.print(result);
    }

    static boolean inRange(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < m;
    }
}