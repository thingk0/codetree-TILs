import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {

    static int N, M;
    static StringTokenizer st;
    static StringBuilder result = new StringBuilder();
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int key = Integer.parseInt(st.nextToken());
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            result.append(map.getOrDefault(Integer.parseInt(st.nextToken()), 0)).append(' ');
        }
        System.out.print(result);
    }
}