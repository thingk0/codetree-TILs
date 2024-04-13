import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, T;
    static int[] firstArray, secondArray;
    static StringTokenizer st;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        firstArray = new int[N];
        secondArray = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            firstArray[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            secondArray[i] = Integer.parseInt(st.nextToken());
        }

        while (T-- > 0) {
            rotateArrays();
        }

        printArray(firstArray);
        printArray(secondArray);

        System.out.print(result);
    }

    private static void rotateArrays() {
        int temp = firstArray[N - 1];
        System.arraycopy(firstArray, 0, firstArray, 1, N - 1);
        firstArray[0] = secondArray[N - 1];
        System.arraycopy(secondArray, 0, secondArray, 1, N - 1);
        secondArray[0] = temp;
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            result.append(value).append(' ');
        }
        result.append('\n');
    }
}