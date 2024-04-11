import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class Main {

    static int N;
    static StringTokenizer st;
    static StringBuilder result = new StringBuilder();
    static PriorityQueue<Integer> pq = new PriorityQueue<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if (cmd.equals("push")) {
                pq.add(-Integer.parseInt(st.nextToken()));
            } else if (cmd.equals("size")) {
                result.append(pq.size()).append('\n');
            } else if (cmd.equals("empty")) {
                result.append(pq.isEmpty() ? 1 : 0).append('\n');
            } else if (cmd.equals("pop")) {
                result.append(-pq.poll()).append('\n');
            } else if (cmd.equals("top")) {
                result.append(-pq.peek()).append('\n');
            }
        }

        System.out.print(result);
    }
}