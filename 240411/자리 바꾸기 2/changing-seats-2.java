import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {

    static int N, K;
    static StringTokenizer st;
    static int[] arr;
    static int[][] changeArr;
    static ArrayList<HashSet<Integer>> list = new ArrayList<>();
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            HashSet<Integer> set = new HashSet<>();
            set.add(i); 
            list.add(set);
            arr[i] = i;
        }



        changeArr = new int[K][];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            changeArr[i] = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        }

        for (int i = 0; i < 3; i++) {
            for (int[] ch : changeArr) {

                int li = ch[0];
                int ri = ch[1];

                int le = arr[li];
                int re = arr[ri];

                arr[li] = re;
                arr[ri] = le;

                list.get(le).add(ri);
                list.get(re).add(li);

            }
        }

        for (int i = 1; i <= N; i++) {
            result.append(list.get(i).size()).append('\n');
        }

        System.out.print(result);
    }
}