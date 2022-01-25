package ch08;

public class Student {
    static int count = 0;

    int id;
    String name;

    Student(int _id , String _name) {
        id  = _id;
        name = _name;
        Student.count += 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
