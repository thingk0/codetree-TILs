public class Main {

    static int n, result = 0;
    static int[] dr = {0, -1, 0, 1};
    static int[] dc = {1, 0, -1, 0};

    public static void main(String[] args) {
        
        n = readInt();
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = readInt();
            }
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int cnt = 0;
                for (int i = 0; i < 4; i++) {
                    int tr = r + dr[i];
                    int tc = c + dc[i];
                    if (isRange(tr, tc) && map[tr][tc] == 1) {
                        cnt++;
                    }
                }
                if (cnt >= 3) {
                    result++;
                }
            }
        }

        System.out.print(result);
    }

    static boolean isRange(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < n;
    }

    static int readInt() {
        int input, output = 0;
        try {
            while ((input = System.in.read()) != -1) {
                if (Character.isDigit(input)) {
                    output = (output * 10) + (input - '0');
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }
}