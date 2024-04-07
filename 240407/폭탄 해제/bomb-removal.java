import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        Bomb bomb = new Bomb(st.nextToken(), st.nextToken().charAt(0), Integer.parseInt(st.nextToken()));
        bomb.print();
    }

    static class Bomb {
        
        String code;
        char color;
        int time;

        Bomb(String code, char color, int time) {
            this.code = code;
            this.color = color;
            this.time = time;
        }

        void print() {
            System.out.printf("code : %s\ncolor : %c\nsecond : %d", code, color, time);
        }
    }
}