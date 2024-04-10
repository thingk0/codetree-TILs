import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static String[] list;

    static HashMap<String, Integer> map;
    static StringTokenizer st;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new HashMap<>();
        list = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            map.put(str, i);
            list[i] = str;
        }

        for (int i = 0; i < M; i++) {
            String find = br.readLine();
            try {
                int num = Integer.parseInt(find);
                result.append(list[num]).append('\n');
                continue;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            result.append(map.get(find)).append('\n');
        }
        
        System.out.print(result);
    }
}