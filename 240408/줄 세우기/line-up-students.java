import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Student implements Comparable<Student> {

    int height;
    int weight;
    int num;

    Student(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

     @Override
    public int compareTo(Student other) {
        if (this.height != other.height) {
            return other.height - this.height;
        } 

        if (this.weight != other.weight) {
            return other.weight - this.weight;
        }

        return this.num - other.num;
    }
};


public class Main {

    static int N;
    static StringTokenizer st;
    static Student[] students;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        students = new Student[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            students[i] = new Student(
                Integer.parseInt(st.nextToken()), 
                Integer.parseInt(st.nextToken()),
                i+1
            );
        }

        Arrays.sort(students);
        for (Student s : students) {
            result.append(String.format("%d %d %d\n", s.height, s.weight, s.num));
        }

        System.out.print(result);
    }
}