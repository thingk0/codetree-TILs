import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    static StringTokenizer st;

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            st = new StringTokenizer(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        String secretCode = st.nextToken();
        char meetingPoint = st.nextToken().charAt(0);
        int time = Integer.parseInt(st.nextToken());

        CodeTree codeTree = new CodeTree(secretCode, meetingPoint, time);
        codeTree.printInfo();
    }

    static class CodeTree {

        String secretCode;
        char meetingPoint;
        int time;

        CodeTree(String secretCode, char meetingPoint, int time) {
            this.secretCode = secretCode;
            this.meetingPoint = meetingPoint;
            this.time = time;
        }

        void printInfo() {
            System.out.printf("secret code : %s\nmeeting point : %c\ntime : %d", secretCode, meetingPoint, time);
        }
    }
}