import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M, maximumXOR = 0;
    static int[] elements;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        elements = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            elements[i] = Integer.parseInt(st.nextToken());
        }

        findCombinations(new int[M], 0, 0);
        System.out.print(maximumXOR);
    }

    static void findCombinations(int[] selectedIndices, int depth, int startIndex) {
        if (depth == M) {
            int xor = 0;
            for (int index : selectedIndices) {
                xor ^= elements[index];
            }
            maximumXOR = Math.max(maximumXOR, xor);
            return;
        }

        for (int i = startIndex; i < N; i++) {
            selectedIndices[depth] = i;
            findCombinations(selectedIndices, depth + 1, i + 1);
        }
    }
}