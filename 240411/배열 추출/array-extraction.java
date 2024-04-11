import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    static int N;
    static StringBuilder result = new StringBuilder();
    static PriorityQueue<Integer> pq = new PriorityQueue<>((p1, p2) -> p2 - p1);

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