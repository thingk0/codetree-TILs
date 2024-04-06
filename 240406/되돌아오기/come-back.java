import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;
    static int n, result = 0, x = 0, y = 0, dir = -1;
    static int[] dx = {1, 0, -1 ,0};
    static int[] dy = {0, 1, 0 ,-1};
    
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            
            n = Integer.parseInt(br.readLine());
            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                switch (st.nextToken().charAt(0)) {
                    case 'E':
                        dir = 0;
                        break;  
                    case 'N':
                        dir = 1;
                        break;
                    case 'W':
                        dir = 2;
                        break;
                    case 'S':
                        dir = 3;
                        break;
                }
                int dis = Integer.parseInt(st.nextToken());
                while (dis-- > 0) {
                    x += dx[dir];
                    y += dy[dir];
                    result++;
                    if (x == 0 && y == 0) {
                        System.out.print(result);
                        return;
                    }
                }
            }

            System.out.print(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}