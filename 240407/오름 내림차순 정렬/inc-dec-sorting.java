import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    static int N;
    static int[] arr;
    static StringTokenizer st;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        for (int e : arr) {
            result.append(e).append(' ');
        }
        result.append('\n');

        int[] reversedArr = Arrays.stream(arr)
                                    .boxed()
                                    .sorted(Collections.reverseOrder())
                                    .mapToInt(Integer::intValue)
                                    .toArray();
        for (int e : reversedArr) {
            result.append(e).append(' ');
        }
        result.append('\n');

        System.out.print(result);
    }
}