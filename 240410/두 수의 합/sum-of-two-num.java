import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static int N, K, result = 0;
    static HashMap<Integer, Integer> map;

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            if (K / 2 == num) {
                int value = map.get(num);
                result += (value * (value - 1)) / 2;
            } else if (map.containsKey(K - num) && map.get(num) > 0 && map.get(K - num) > 0) {
                result += (map.get(K - num) * map.get(num));
                map.put(K - num, 0);
                map.put(num, 0);
            }
        }
    
        System.out.print(result);
    }
}