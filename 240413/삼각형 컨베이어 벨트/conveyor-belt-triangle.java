import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, T;
    static int[] firstSide, secondSide, thirdSide;
    static StringTokenizer st;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        firstSide = new int[N];
        secondSide = new int[N];
        thirdSide = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            firstSide[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            secondSide[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            thirdSide[i] = Integer.parseInt(st.nextToken());
        }

        for (int t = 0; t < T; t++) {
            rotate();
        }

        printSide(firstSide);
        printSide(secondSide);
        printSide(thirdSide);
        System.out.print(result);
    }

    private static void rotate() {
        int temp = thirdSide[N - 1];
        System.arraycopy(thirdSide, 0, thirdSide, 1, N - 1);
        thirdSide[0] = secondSide[N - 1];
        
        System.arraycopy(secondSide, 0, secondSide, 1, N - 1);
        secondSide[0] = firstSide[N - 1];
        
        System.arraycopy(firstSide, 0, firstSide, 1, N - 1);
        firstSide[0] = temp;
    }

    private static void printSide(int[] side) {
        for (int i = 0; i < N; i++) {
            result.append(side[i]).append(' ');
        }
        result.append('\n');
    }
}