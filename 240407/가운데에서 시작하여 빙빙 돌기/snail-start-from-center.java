import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int N, dis = 1, dir = 0, num = 1, r, c, tr, tc;
    static int[][] map;

    static int[] dr = {0, -1, 0, 1};
    static int[] dc = {1, 0, -1, 0};

    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) {

        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            N = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        map = new int[N][N];

        r = N / 2;
        c = N / 2;

        map[r][c] = num;
        while (num < N * N) {
            int curDis = 0;
            while(curDis++ < dis) {
                tr = r + dr[dir];
                tc = c + dc[dir];
                if (!inRange(tr, tc) || map[tr][tc] != 0) {
                    break;
                }
                r = tr;
                c = tc;
                map[r][c] = ++num;
            }
            dir = (dir + 1) % 4;
            if (dir == 0 || dir == 2) {
                dis++;
            }
        }

        for (int[] row : map) {
            for (int num : row) {
                result.append(num).append(" ");
            }
            result.append("\n");
        }

        System.out.print(result);
    }

    static boolean inRange(int r, int c) {
        return 0 <= r && r < N && 0 <= c && c < N;
    }
}