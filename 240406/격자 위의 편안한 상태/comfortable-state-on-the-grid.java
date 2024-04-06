import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M, r, c;
    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
    static int[] status;
    static int[][] board;
    static StringTokenizer st;

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            board = new int[N + 1][N + 1];
            status = new int[M];

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                r = Integer.parseInt(st.nextToken());
                c = Integer.parseInt(st.nextToken());

                board[r][c] = 1;

                int cnt = 0;
                for (int j = 0; j < 4; j++) {
                    int tr = r + dr[j];
                    int tc = c + dc[j];
                    if (inRange(tr, tc) && board[tr][tc] == 1)
                        cnt++;
                }

                if (cnt == 3) {
                    status[i] = 1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        StringBuilder result = new StringBuilder();
        for (int s : status) {
            result.append(s).append("\n");
        }

        System.out.print(result);
    }

    static boolean inRange(int r, int c) {
        return 1 <= r && r <= N && 1 <= c && c <= N;
    }
}