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
        arr = new int[N * 2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N * 2; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        for (int i = 0, j = 2 * N - 1; i < j; i++, j--) {
            if (result < arr[i] + arr[j]) {
                result = arr[i] + arr[j];
            }
        }

        System.out.print(result);
    }
}