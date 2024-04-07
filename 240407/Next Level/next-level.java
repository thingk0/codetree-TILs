import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        String id = st.nextToken();
        String lv = st.nextToken();

        User u1 = new User();
        User u2 = new User(id, lv);

        u1.print();
        u2.print();
    }

    static class User {
        
        String id;
        String lv;

        User() {
            this("codetree", "10");
        }

        User(String id, String lv) {
            this.id  = id;
            this.lv = lv;
        }

        void print() {
            System.out.printf("user %s lv %s\n", id, lv);
        }
    }
}