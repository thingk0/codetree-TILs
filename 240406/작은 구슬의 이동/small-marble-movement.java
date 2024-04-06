import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, t, r, c, d;
    static int[] dr = {0, 1, -1, 0};
    static int[] dc = {1, 0, 0, -1};

    static StringTokenizer st;

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            t = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            switch (st.nextToken().charAt(0)) {
                case 'R':
                    d = 0;
                    break;
                case 'D':
                    d = 1;
                    break;
                case 'U':
                    d = 2;
                    break;
                case 'L':
                    d = 3;
                    break;
            }

            for (int i = 1; i <= t; i++) {
                if (!isRange(r + dr[d], c + dc[d])) {
                    d = 3 - d;
                    continue;
                }

                r += dr[d];
                c += dc[d];
            }

            System.out.print(r + " " + c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static boolean isRange(int r, int c) {
        return 1 <= r && r <= n && 1 <= c && c <= n;
    }
}