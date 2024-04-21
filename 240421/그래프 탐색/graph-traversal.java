import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<List<Integer>> graph;
    static boolean[] visited;
    static int result = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        visited = new boolean[N + 1];
        graph = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>(N));
        }

        for (int i = 0; i < M; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        visited[1] = true;
        dfs(1);
        System.out.println(result);
    }

    static void dfs(int v) {
        for (int curV : graph.get(v)) {
            if (!visited[curV]) {
                visited[curV] = true;
                result++;
                dfs(curV);
            }
        }
    }
}