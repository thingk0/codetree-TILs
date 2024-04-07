import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, T, result, dir, r, c, tr, tc;
    static int[][] map;
    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
    static char[] cmdList;
    static StringTokenizer st;

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            T = Integer.parseInt(st.nextToken());
            cmdList = br.readLine().toCharArray();

            map = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        dir = 3;
        r = N / 2;
        c = N / 2;
        result = map[r][c];

        int idx = 0;
        while(idx < T) {
            char cmd = cmdList[idx++];
            if (cmd == 'F') {
                tr = r + dr[dir];
                tc = c + dc[dir];
                if (!inRange(tr, tc)) {
                    continue;
                }
                r = tr;
                c = tc;
                result += map[r][c];
            } else if (cmd == 'R') {
                dir = (dir + 1) % 4;
            } else if (cmd == 'L') {
                dir = (dir + 3) % 4;
            }
        }

        System.out.print(result);
    }

    static boolean inRange(int r, int c) {
        return 0 <= r && r < N && 0 <= c && c < N;
    }
}