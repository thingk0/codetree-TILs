import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static int n, k;
    static String prefix, input;
    static List<String> list = new ArrayList<>();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        prefix = st.nextToken();

        while (n-- > 0) {
            input = br.readLine();
            if (input.startsWith(prefix)) {
                list.add(input);
            }
        }

        Collections.sort(list);
        System.out.print(list.get(k - 1));
    }
}