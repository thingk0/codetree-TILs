import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Student implements Comparable<Student> {

    String name;
    int kor, eng, math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int scoreSum() {
        return kor + eng + math;
    }

     @Override
    public int compareTo(Student other) {
        return this.scoreSum() - other.scoreSum();
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
                st.nextToken(),
                Integer.parseInt(st.nextToken()), 
                Integer.parseInt(st.nextToken()), 
                Integer.parseInt(st.nextToken())
            );
        }

        Arrays.sort(students);
        for (Student s : students) {
            result.append(String.format("%s %d %d %d\n", s.name, s.kor, s.eng, s.math));
        }

        System.out.print(result);
    }
}