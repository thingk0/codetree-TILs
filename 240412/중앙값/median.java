import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class Main {

    static int T, N;
    static int[] arr;
    static StringTokenizer st;
    static PriorityQueue<Integer> pqMax;
    static PriorityQueue<Integer> pqMin;
    static StringBuilder result = new StringBuilder();

    static void pqInit() {
        pqMax = new PriorityQueue<>((p1, p2) -> p2 - p1);
        pqMin = new PriorityQueue<>((p1, p2) -> p1 - p2);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {

            N = Integer.parseInt(br.readLine());
            arr = new int[N];

            pqInit();

            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                int num = Integer.parseInt(st.nextToken());

                pqMax.add(num);
                pqMin.add(pqMax.poll());

                if (pqMin.size() > pqMax.size()) {
                    pqMax.add(pqMin.poll());
                }

                if (j % 2 != 0) {
                    result.append(pqMax.peek()).append(' ');
                }
            }
            result.append('\n');
        }

        System.out.print(result);
    }
}