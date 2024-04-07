import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        String name = st.nextToken();
        String code = st.nextToken();

        Item i1 = new Item();
        Item i2 = new Item(name, code);

        i1.print();
        i2.print();
    }

    static class Item {
        
        String name;
        String code;

        Item() {
            this("codetree", "50");
        }

        Item(String name, String code) {
            this.name  = name;
            this.code = code;
        }

        void print() {
            System.out.printf("product %s is %s\n", code, name);
        }
    }
}