import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, result = 0;
    static int[] dr = {0, -1, 0, 1};
    static int[] dc = {1, 0, -1, 0};
    static StringTokenizer st;
    public static void main(String[] args) {

        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {

            n = Integer.parseInt(br.readLine());
            int[][] map = new int[n][n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    int cnt = 0;
                    for (int i = 0; i < 4; i++) {
                        int tr = r + dr[i];
                        int tc = c + dc[i];
                        if (isRange(tr, tc) && map[tr][tc] == 1) {
                            cnt++;
                        }
                    }
                    if (cnt >= 3) {
                        result++;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.print(result);
    }

    static boolean isRange(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < n;
    }
}