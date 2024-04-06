public class Main {

    static int cmd;
    static int dir = 3, t = 0, x = 0, y = 0;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        try {
            while((cmd = System.in.read()) != -1 && Character.isLetter((char) cmd)) {
                switch (cmd) {
                    case 'L':
                        dir = (dir + 3) % 4;
                        t++;
                        break;
                    case 'R':
                        dir = (dir + 1) % 4;
                        t++;
                        break;
                    case 'F':
                        x += dx[dir];
                        y += dy[dir];
                        t++;
                        break;
                }

                if (x == 0 && y == 0) {
                    System.out.print(t);
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.print(-1);
    }
}