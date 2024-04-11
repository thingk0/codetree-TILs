import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

class Point implements Comparable<Point> {

    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int distanceFromOrigin() {
        return Math.abs(this.x + this.y);
    }

    @Override
    public int compareTo(Point p) {
        if (this.distanceFromOrigin() == p.distanceFromOrigin()) {
            if (this.x == p.x) {
                return this.y - p.y;
            }

            return this.x - p.x;
        }

        return this.distanceFromOrigin() - p.distanceFromOrigin();
    }

}

public class Main {

    static int N, M;
    static StringTokenizer st;
    static PriorityQueue<Point> pq = new PriorityQueue<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            pq.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        for (int i = 0; i < M; i++) {
            Point p = pq.poll();
            pq.add(new Point(p.x + 2, p.y + 2));
        }

        Point result = pq.peek();
        System.out.print(result.x + " " + result.y);
    }
}