import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;;

public class Main {

    static int n, m;
    static StringTokenizer st;
    static ArrayList<Integer>[] adjList;
    static boolean[] visited;
    static int vertexCnt = 0;

    public static void DFS(int vertex) {
        for(int i = 0; i < adjList[vertex].size(); i++) {
            int currV = adjList[vertex].get(i);
            if(!visited[currV]) {
                visited[currV] = true;
                vertexCnt++;
                DFS(currV);
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        adjList = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for(int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }

        while(m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }

        visited[1] = true;
        DFS(1);
        
        System.out.println(vertexCnt);
    }
}