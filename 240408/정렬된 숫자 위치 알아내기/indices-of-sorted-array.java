import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {

    static int N;
    static int[] arr;
    static Integer[] indices;
    static StringTokenizer st;
    static Map<Integer, Integer> map = new HashMap<>();
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        arr = new int[N];
        indices = new Integer[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            indices[i] = i;
        }

        Arrays.sort(indices, (i1, i2) -> arr[i1] - arr[i2]);
    
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(arr[indices[i]])) {
                map.put(arr[indices[i]], i);
            }
        }

        for (int num : arr) {
            int idx = map.get(num);
            map.put(num, idx + 1);
            result.append(idx + 1).append(' ');
        }

        System.out.print(result);
    }
}