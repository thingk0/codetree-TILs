import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static StringTokenizer st;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        comb(new int[M], 0, 0);
        System.out.print(result);
    }

    static void comb(int[] selected, int level, int start) {
        if (level == M) {
           for (int num : selected) {
            result.append(num).append(' ');
           }
           result.append('\n');
           return;
        }

        for (int i = start; i < N; i++) {
            selected[level] = i + 1;
            comb(selected, level + 1, i + 1);
        }
    }
}