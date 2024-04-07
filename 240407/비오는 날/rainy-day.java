import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Data implements Comparable<Data> {

    String date;
    String day;
    String weather;

    Data(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    void print() {
        System.out.printf("%s %s %s", date, day, weather);
    }

    @Override
    public int compareTo(Data other) {
        int weatherComp = this.weather.compareTo(other.weather);
        if (weatherComp != 0) {
            return weatherComp;
        }
        return this.date.compareTo(other.date);
    }
}
public class Main {

    static int N;
    static Data[] datas;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        datas = new Data[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            datas[i] = new Data(st.nextToken(), st.nextToken(), st.nextToken());
        }

        Arrays.sort(datas);
        datas[0].print();
    }
}