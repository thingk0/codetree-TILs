public class Main {

    static int cd;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        
        int x = 0, y = 0;
        int dir = 3;

        try {
            while((cd = System.in.read()) != -1 && Character.isLetter((char) cd)) {
                if (cd == 'L') {
                    dir = (dir + 3) % 4; 
                } else if (cd == 'R') {
                    dir = (dir + 1) % 4;
                } else if (cd == 'F') {
                    x += dx[dir];
                    y += dy[dir];
                }
            }
            
            System.out.print(x + " " + y);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}