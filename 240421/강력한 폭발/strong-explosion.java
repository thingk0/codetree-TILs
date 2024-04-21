import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int N;
    static int[][] grid;
    static int result = 0, bombCnt;
    static List<int[]> bombList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        grid = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int tmp = grid[i][j] = scanner.nextInt();
                if (tmp == 1) {
                    bombList.add(new int[] {i, j});
                }
            }
        }
        bombCnt = bombList.size();
        computeCombinations(0, new int[bombCnt]);
        System.out.println(result);
    }

    static boolean inRange(int r, int c) {
        return r >= 0 && r < N && c >= 0 && c < N;
    }

    static int applyATypeBomb(int r, int c, int[][] copyGrid) {
        int count = 0;
        int[] rows = {-2, -1, 1, 2};
        for (int delta : rows) {
            int nr = r + delta;
            if (inRange(nr, c) && copyGrid[nr][c] == 0) {
                copyGrid[nr][c] = 1;
                count++;
            }
        }
        return count;
    }

    static int applyBTypeBomb(int r, int c, int[][] copyGrid) {
        int count = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        for (int[] dir : directions) {
            int nr = r + dir[0];
            int nc = c + dir[1];
            if (inRange(nr, nc) && copyGrid[nr][nc] == 0) {
                copyGrid[nr][nc] = 1;
                count++;
            }
        }
        return count;
    }

    static int applyCTypeBomb(int r, int c, int[][] copyGrid) {
        int count = 0;
        int[][] directions = {{-1, -1}, {-1, 1}, {1, 1}, {1, -1}};
        for (int[] dir : directions) {
            int nr = r + dir[0];
            int nc = c + dir[1];
            if (inRange(nr, nc) && copyGrid[nr][nc] == 0) {
                copyGrid[nr][nc] = 1;
                count++;
            }
        }
        return count;
    }

    static void computeCombinations(int depth, int[] selected) {
        if (depth == bombCnt) {

            int[][] copyGrid = new int[N][N];
            for (int i = 0; i < N; i++) {
                System.arraycopy(grid[i], 0, copyGrid[i], 0, N);
            }

            int maxBombCount = bombCnt;
            for (int i = 0; i < bombCnt; i++) {
                int[] bomb = bombList.get(i);
                int bombType = selected[i];
                switch (bombType) {
                    case 1:
                        maxBombCount += applyATypeBomb(bomb[0], bomb[1], copyGrid);
                        break;
                    case 2:
                        maxBombCount += applyBTypeBomb(bomb[0], bomb[1], copyGrid);
                        break;
                    case 3:
                        maxBombCount += applyCTypeBomb(bomb[0], bomb[1], copyGrid);
                        break;
                }
            }
            result = Math.max(result, maxBombCount);
            return;
        }

        for (int i = 1; i <= 3; i++) {
            selected[depth] = i;
            computeCombinations(depth + 1, selected);
        }
    }
}