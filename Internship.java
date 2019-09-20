package institution.interlink;

import person.Student;

import java.util.ArrayList;

public class Internship {
    public String name;
    ArrayList<Student> students = new ArrayList<>();

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        int minimalMark = 80;
        if(minimalMark<student.getKnowledge().getLevel()){
            students.add(student);
            System.out.println("Студент пройшов: " + student.name);
        }
    }

    public String getStudents() {
        return students.toString();
    }
}
