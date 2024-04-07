import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Person implements Comparable<Person> {

    String name;
    String addr;
    String city;

    Person(String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
    }

    void print() {
        System.out.printf("name %s\naddr %s\ncity %s", name, addr, city);
    }

    @Override
    public int compareTo(Person other) {
        return other.name.compareTo(this.name);
    } 
}

public class Main {
    
    static int N;
    static Person[] people;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        people = new Person[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            people[i] = new Person(st.nextToken(), st.nextToken(), st.nextToken());
        }

        Arrays.sort(people);
        people[0].print();
    }
}