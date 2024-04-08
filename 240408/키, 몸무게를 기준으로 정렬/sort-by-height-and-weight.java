import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Person {

    String name;
    int height;
    int weight;

    Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
};


public class Main {

    static int N;
    static StringTokenizer st;
    static Person[] people;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        people = new Person[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            people[i] = new Person(
                st.nextToken(),
                Integer.parseInt(st.nextToken()), 
                Integer.parseInt(st.nextToken())
            );
        }

        Arrays.sort(people, (p1, p2) -> {
            if (p1.height == p2.height) {
                return p2.weight - p1.weight;
            }

            return p1.height - p2.height;
        });
        for (Person s : people) {
            result.append(String.format("%s %d %d\n", s.name, s.height, s.weight));
        }
        System.out.print(result);
    }
}