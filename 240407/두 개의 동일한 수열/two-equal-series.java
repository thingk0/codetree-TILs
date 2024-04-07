import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

public class Main {

    static Set<Integer> set = new HashSet<>();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // N 생략
        br.readLine();

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            set.remove(Integer.parseInt(st.nextToken()));
        }

        if (set.isEmpty()) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}