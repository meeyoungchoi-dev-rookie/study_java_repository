package ch08;

public class StudentTest {
    public static void main(String[] args) {

        Student park = new Student(2019122104 , "park");
        Student kim = new Student(2019220602,  "kim");
        Student lee = new Student(2019151324 , "lee");

        System.out.println("총 학생수: " + Student.count);

    }
}
