import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static int N, sum = 0;
    static int[] arr;
    static double maxAvg = 0.0;
    static StringTokenizer st;
    static PriorityQueue<Integer> pq = new PriorityQueue<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        pq.add(arr[N - 1]);
        sum += arr[N - 1];

        for (int k = N - 2; k >= 1; k--) {
            pq.add(arr[k]);
            sum += arr[k];

            maxAvg = Math.max(maxAvg, (sum * 1.0 - pq.peek()) / (N - k - 1));
        }

        System.out.printf("%.2f", maxAvg);
    }
}