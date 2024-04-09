import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {

    static String cmd;
    static int N, key;
    static StringTokenizer st;
    static StringBuilder result = new StringBuilder();
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            cmd = st.nextToken();
            key = Integer.parseInt(st.nextToken());

            if (cmd.equals("add")) {
                map.put(key, Integer.parseInt(st.nextToken()));
                continue;
            } else if (cmd.equals("find")) {
                result.append(map.containsKey(key) ? map.get(key) : "None").append('\n');
            } else {
                map.remove(key);
            }
        }

        System.out.print(result);
    }
}