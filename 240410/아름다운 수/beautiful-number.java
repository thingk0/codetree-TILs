import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int n;
    public static int ans;
    public static ArrayList<Integer> seq = new ArrayList<>();
    
    public static boolean isBeautiful() {
        for(int i = 0; i < n; i += seq.get(i)) {

            if(i + seq.get(i) - 1 >= n) {
                return false;
            }

            for(int j = i; j < i + seq.get(i); j++) {
                if(seq.get(j) != seq.get(i)) {
                    return false;
                }
            }
        }

        return true;
    }
    
    public static void cntBeautySequence(int cnt) {
        
        if(cnt == n) {
            if(isBeautiful())
                ans++;
            return;
        }
        
        for(int i = 1; i <= 4; i++) {
            seq.add(i);
            cntBeautySequence(cnt + 1);
            seq.remove(seq.size() - 1);
        }
    }
    

    public static void main(String[] args) {
        n = new Scanner(System.in).nextInt();
        cntBeautySequence(0);
        System.out.print(ans);
    }
}