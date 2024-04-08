import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Point {

    int x;
    int y;
    int num;
    int manhattan;

    Point(int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
        manhattan = Math.abs(x - 0) + Math.abs(y - 0);
    }

};


public class Main {

    static int N;
    static StringTokenizer st;
    static Point[] points;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        points = new Point[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            points[i] = new Point(
                Integer.parseInt(st.nextToken()), 
                Integer.parseInt(st.nextToken()), 
                i+1
            );
        }

        Arrays.sort(points, (p1, p2) -> {
            if (p1.manhattan == p2.manhattan) {
                return p1.num - p2.num;
            }
            return p1.manhattan - p2.manhattan;
        });

        for (Point p : points) {
            result.append(p.num).append('\n');
        }
        System.out.print(result);
    }
}