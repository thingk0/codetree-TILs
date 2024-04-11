import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static StringTokenizer st;
    static PriorityQueue<Integer> pq = new PriorityQueue<>((p1, p2) -> p2 - p1);

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            pq.add(Integer.parseInt(st.nextToken()));
        }

        while (pq.size() >= 2) {
            int num1 = pq.poll();
            int num2 = pq.poll();

            if (num1 == num2) {
                continue;
            }

            pq.add(Math.abs(num1 - num2));
        }

        System.out.print(pq.peek());
    }
}