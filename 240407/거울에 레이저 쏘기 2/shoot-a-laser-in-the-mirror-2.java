import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, K, dir, r, c, result = 0;
    static char[][] map;
    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            N = Integer.parseInt(br.readLine());
            map = new char[N + 1][N + 1];
            for (int i = 1; i <= N; i++) {
                String row = br.readLine();
                for (int j = 1; j <= N; j++) {
                    map[i][j] = row.charAt(j - 1);
                }
            }

            K = Integer.parseInt(br.readLine());
            init(K);
            
            while(inRange(r, c)) {
                if (map[r][c] == '/') {
                    move(3 - dir);
                } else {
                    move(dir ^ 1);
                }
                result++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.print(result);
    }

    static void move(int nextDir) {
        r += dr[nextDir];
        c += dc[nextDir];
        dir = nextDir;
    }

    static void init(int num) {
        if (num <= N) {
            r = 1;
            c = num;
            dir = 1;
        } else if (num <= 2 * N) {
            r = num - N;
            c = N;
            dir = 2;
        } else if (num <= 3 * N) {
            r = N;
            c = (N * 3 + 1) - num;
            dir = 3;
        } else if (num <= 4 * N) {
            r = (N * 4 + 1) - num;
            c = 1; 
            dir = 0;
        }
    }

    static boolean inRange(int r, int c) {
        return 1 <= r && r <= N && 1 <= c && c <= N;
    }
}