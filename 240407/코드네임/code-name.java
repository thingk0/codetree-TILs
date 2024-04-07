import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    
    static Agent[] agents = new Agent[5];
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            agents[i] = new Agent(st.nextToken().charAt(0), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(agents, (a1, a2) -> a1.score - a2.score);
        System.out.print(agents[0].code + " " + agents[0].score);
    }

    static class Agent {
        
        char code;
        int score;

        Agent(char code, int score) {
            this.code = code;
            this.score = score;
        }
    }
}