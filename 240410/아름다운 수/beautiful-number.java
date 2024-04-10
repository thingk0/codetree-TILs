import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int N, result = 0;

    static boolean isBeautiful(int[] arr) {
        int count = 1;
        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count != arr[i - 1]) {
                    return false;
                }
                count = 1;
            }
        }
        return count == arr[N - 1];
    }

    static void permu(int[] arr, int size) {
        if (size == N) {
            if (isBeautiful(arr)) {
                result++;
            }
            return;
        }
        for (int i = 1; i <= 4; i++) {
            arr[size] = i;
            permu(arr, size + 1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        permu(new int[N], 0);
        System.out.print(result);
    }
}