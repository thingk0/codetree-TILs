import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static StringTokenizer st;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int[] pos = {0, 0};
            N = Integer.parseInt(br.readLine());
            
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                char dir = st.nextToken().charAt(0);
                int dis = Integer.parseInt(st.nextToken());
                switch(dir) {
                    case 'E': // 동쪽으로 이동
                        pos[0] += dx[0] * dis;
                        pos[1] += dy[0] * dis;
                        break;
                    case 'S': // 남쪽으로 이동
                        pos[0] += dx[1] * dis;
                        pos[1] += dy[1] * dis;
                        break;
                    case 'W': // 서쪽으로 이동
                        pos[0] += dx[2] * dis;
                        pos[1] += dy[2] * dis;
                        break;
                    case 'N': // 북쪽으로 이동
                        pos[0] += dx[3] * dis;
                        pos[1] += dy[3] * dis;
                        break;
                }
            }

            bw.write(pos[0] + " " + pos[1]);
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}