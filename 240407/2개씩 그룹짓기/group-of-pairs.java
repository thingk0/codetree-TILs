import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

    static int result = Integer.MIN_VALUE;
    static int N;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[2 * N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N * 2; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            if (result < arr[i] + arr[2 * N - i - 1]) {
                result = arr[i] + arr[2 * N - i - 1];
            }
        }

        System.out.print(result);
    }
}