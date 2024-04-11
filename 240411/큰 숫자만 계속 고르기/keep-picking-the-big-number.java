import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class Main {

    static int N, M;
    static StringTokenizer st;
    static PriorityQueue<Integer> pq = new PriorityQueue<>((p1, p2) -> (p2 - p1));

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            pq.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < M; i++) {
            pq.add(pq.poll() - 1);
        }

        System.out.print(pq.peek());
    }
}