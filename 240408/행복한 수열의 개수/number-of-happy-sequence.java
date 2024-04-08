import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M, result = 0;
    static int[][] map;
    static int[] seq;
    static StringTokenizer st;

    static boolean isHappySeq() {
        int cnt = 1, maxCnt = 1;
        for (int i = 1; i < N; i++) {
            if (seq[i] == seq[i-1]) {
                cnt++;
            } else {
                cnt = 1;
            }
            maxCnt = Math.max(maxCnt, cnt);
        }
        return maxCnt >= M;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        seq = new int[N];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                seq[j] = map[i][j];
            }

            if(isHappySeq()) {
                result++;
            }
        }

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                seq[i] = map[i][j];
            }

            if(isHappySeq()) {
                result++;
            }
        }

        System.out.print(result);
    }
}