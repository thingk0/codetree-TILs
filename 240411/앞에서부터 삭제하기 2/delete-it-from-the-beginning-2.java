import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] arr;
    static double max = 0.0;
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

        for (int k = 1; k <= N - 2; k++) {
            for (int l = k; l < N; l++) {
                pq.add(arr[l]);
            }

            pq.poll();

            if (k == N - 2) {
                max = Math.max(max, pq.poll() * 1.0);
                continue;
            }

            double sum = 0.0;
            int size = pq.size();
            while (!pq.isEmpty()) {
                sum += pq.poll();
            }

            sum /= size;
            max = Math.max(max, sum);
        }

        System.out.printf("%.2f", max);
    }
}