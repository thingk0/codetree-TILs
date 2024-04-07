import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input1 = br.readLine().toCharArray();
        char[] input2 = br.readLine().toCharArray();

        Arrays.sort(input1);
        Arrays.sort(input2);

        if (input1.length != input2.length) {
            System.out.print("No");
            return;
        }

        for (int i = 0; i < input1.length; i++) {
            if (input1[i] != input2[i]) {
                System.out.print("No");
                return;
            }
        }

        System.out.print("Yes");
    }
}