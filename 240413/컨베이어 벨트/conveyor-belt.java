import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, T;
    static int[] arr;
    static StringTokenizer st;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        arr = new int[2 * N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = N; i < 2 * N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (T-- > 0) {
            for (int i = 2 * N - 1; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = arr[2 * N];
        }

        for (int i = 0; i < N; i++) {
            result.append(arr[i]).append(' ');
        }
        result.append('\n');

        for (int i = N; i <  2 * N; i++) {
            result.append(arr[i]).append(' ');
        }

        System.out.print(result);
    }
}