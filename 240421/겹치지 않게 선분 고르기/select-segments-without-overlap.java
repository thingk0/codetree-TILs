import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int N;
    static List<int[]> lines = new ArrayList<>();
    static List<int[]> selected = new ArrayList<>();
    static int result = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            lines.add(new int[]{x1, x2});
        }

        comb(0);
        System.out.println(result);
    }

    static boolean isOverlapped(int[] line1, int[] line2) {
        int x1 = line1[0], x2 = line1[1], x3 = line2[0], x4 = line2[1];
        return (x1 <= x3 && x3 <= x2) || (x1 <= x4 && x4 <= x2) ||
               (x3 <= x1 && x1 <= x4) || (x3 <= x2 && x2 <= x4);
    }

    static boolean isPossible() {
        for (int i = 0; i < selected.size(); i++) {
            for (int j = i + 1; j < selected.size(); j++) {
                if (isOverlapped(selected.get(i), selected.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    static void comb(int depth) {
        if (depth == N) {
            if (isPossible()) {
                result = Math.max(result, selected.size());
            }
            return;
        }

        selected.add(lines.get(depth));
        comb(depth + 1);

        selected.remove(selected.size() - 1);
        comb(depth + 1);
    }
}