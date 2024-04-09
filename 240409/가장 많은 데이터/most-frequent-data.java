import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    static int N;
    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;

        while (N-- > 0) {
            String color = br.readLine();
            int count = map.getOrDefault(color, 0) + 1;
            map.put(color, count);
            max = Math.max(max, count);
        }

        System.out.print(max);
    }
}