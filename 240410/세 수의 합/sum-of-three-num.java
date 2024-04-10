import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static int N, K, result = 0;
    static int[] arr;
    static HashMap<Integer, Integer> map;

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new HashMap<>();
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) - 1);
            for (int j = 0; j < i; j++) {
                result += map.getOrDefault(K - arr[i] - arr[j], 0);
            }
        }
    
        System.out.print(result);
    }
}