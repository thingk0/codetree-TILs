import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {

    static int N, K;
    static StringTokenizer st;
    static int[] positions;
    static int[][] swapOperations;
    static ArrayList<HashSet<Integer>> swapHistory = new ArrayList<>();
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        positions = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            HashSet<Integer> set = new HashSet<>();
            set.add(i); 
            swapHistory.add(set);
            positions[i] = i;
        }

        swapOperations = new int[K][];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            swapOperations[i] = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        }

        for (int i = 0; i < 3; i++) {
            for (int[] ch : swapOperations) {                
                int li = ch[0];
                int ri = ch[1];

                int temp = positions[li];
                positions[li] = positions[ri];
                positions[ri] = temp;

                swapHistory.get(positions[li]).add(ri);
                swapHistory.get(positions[ri]).add(li);
            }
        }

        for (int i = 1; i <= N; i++) {
            result.append(swapHistory.get(i).size()).append('\n');
        }

        System.out.print(result);
    }
}