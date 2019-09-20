package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;
import java.util.Random;

public class University {
    public String name;
    Random rand = new Random();

    ArrayList<Student> students = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
    }

    public void teachStudents() {
        for (Student student : this.students) {
            student.setKnowledge(new Knowledge(rand.nextInt() % 100));
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
