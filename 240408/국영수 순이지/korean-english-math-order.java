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

     @Override
    public int compareTo(Student other) {
        if(this.kor != other.kor)
            return other.kor - this.kor; // 국어 점수에 대해 내림차순 정렬
        else if (this.eng != other.eng)
            return other.eng - this.eng; // 영어 점수에 대해 내림차순 정렬
        else
            return other.math - this.math; // 수학 점수에 대해 내림차순 정렬
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