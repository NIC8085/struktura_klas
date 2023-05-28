import klasy.Starost;
import klasy.Student;
import klasy.University;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Student student = new Student("Kacper", "Markowski");
        student.learn(LocalDate.of(2023,5,25),LocalDate.now());
        student.party(LocalDate.of(2023,5,27),LocalDate.now());
        System.out.println(student.isGoodStudent());
        University university = new University();
        university.addStudent();
        university.getStudent("Kacper", "Markowski");
        university.removeStudent("Kacper", "Markowski");

    }
}