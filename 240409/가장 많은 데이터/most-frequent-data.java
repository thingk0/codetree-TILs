import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    static int N;
    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String color = br.readLine();
            map.put(color, map.getOrDefault(color, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (int cnt : map.values()) {
            max = max < cnt ? cnt : max;
        }
        
        System.out.print(max);
    }
}