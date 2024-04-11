import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {

    static int N, M, result = 0;
    static String[] A, B;
    static StringTokenizer st;

    static boolean isVerify(int[] selectedIdx) {
        HashSet<String> set = new HashSet<>();
        for (String str : A) {
            StringBuilder sb = new StringBuilder();
            for (int idx : selectedIdx) {
                sb.append(str.charAt(idx));
            }
            set.add(sb.toString());
        }

        for (String str : B) {
            StringBuilder sb = new StringBuilder();
            for (int idx : selectedIdx) {
                sb.append(str.charAt(idx));
            }

            if (set.contains(sb.toString())) {
                return false;
            }
        }

        return true;
    }

    static void comb(int[] selectedIdx, int level, int start) {
        if (level == N) {
            if (isVerify(selectedIdx)){
                result++;
            }
            return;
        }

        for (int i = start; i < M; i++) {
            selectedIdx[level] = i;
            comb(selectedIdx, level + 1, i + 1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new String[N];
        for (int i = 0; i < N; i++) {
            A[i] = br.readLine();
        }

        B = new String[N];
        for (int i = 0; i < N; i++) {
            B[i] = br.readLine();
        }

        comb(new int[3], 0, 0);
        System.out.print(result);
    }
}