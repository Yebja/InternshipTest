package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {

        University university = new University("CH.U.I.");
        System.out.println(university.name);
        university.addStudent(new Student("Andrew Kostenko"));
        university.addStudent(new Student("Julia Veselkina"));
        university.addStudent(new Student("Maria Perechrest"));
        university.teachStudents();
        Internship internship = new Internship("Interlink");
        university.getStudents().forEach(student -> internship.setStudent(student));
        System.out.println(internship.getStudents());
    }
}
