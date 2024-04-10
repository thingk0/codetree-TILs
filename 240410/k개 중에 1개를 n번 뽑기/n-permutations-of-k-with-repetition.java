import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, K;
    static StringTokenizer st;
    static StringBuilder result = new StringBuilder();

    static void comb(int[] arr, int idx) {
        if (idx == N) {
            for (int e : arr) {
                result.append(e).append(' ');
            }
            result.append('\n');
            return;
        }

        for (int i = 1; i <= K; i++) {
            arr[idx] = i;
            comb(arr, idx + 1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        comb(new int[N], 0);
        System.out.print(result);
    }
}