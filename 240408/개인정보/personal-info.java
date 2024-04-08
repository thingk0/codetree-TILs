import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Person {

    String name;
    int height;
    double weight;

    Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
};


public class Main {

    static int N = 5;
    static StringTokenizer st;
    static Person[] people;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        people = new Person[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            people[i] = new Person(
                st.nextToken(),
                Integer.parseInt(st.nextToken()), 
                Double.parseDouble(st.nextToken())
            );
        }

        result.append("name").append('\n');
        Arrays.sort(people, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for (Person s : people) {
            result.append(String.format("%s %d %.1f\n", s.name, s.height, s.weight));
        }
        result.append('\n');

        result.append("height").append('\n');
        Arrays.sort(people, (p1, p2) -> {
            return p2.height - p1.height;
        });
        for (Person s : people) {
            result.append(String.format("%s %d %.1f\n", s.name, s.height, s.weight));
        }
        System.out.print(result);
    }
}