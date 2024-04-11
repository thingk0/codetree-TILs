import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class Main {

    static int N, M;
    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (pq.isEmpty()) {
                    result.append('0').append('\n');
                    continue;
                }

                result.append(pq.poll()).append('\n');
            } else {
                pq.add(num);
            }
        }

        System.out.print(result);
    }
}