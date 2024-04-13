import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M, result = 0;
    static int[] numbers;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        comb(new int[M], 0, 0);
        System.out.print(result);
    }

    static void comb(int[] selected, int level, int start) {
        if (level == M) {
            int xor = 0;
            for (int i : selected) {
                xor ^= numbers[i];
            }
            result = Math.max(result, xor);
            return;
        }

        for (int i = start; i < N; i++) {
            selected[level] = i;
            comb(selected, level + 1, i + 1);
        }
    }
}