import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

    static int N;
    static int[] A, B;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        B = new int[N];

        StringTokenizer inputA = new StringTokenizer(br.readLine());
        StringTokenizer inputB = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(inputA.nextToken());
            B[i] = Integer.parseInt(inputB.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < N; i++) {
            if(A[i] != B[i]) {
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}