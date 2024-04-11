import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {

    static StringTokenizer st;
    static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        System.out.print(set.size());
    }
}