package klasy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String imie = in.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = in.nextLine();
        students.add(new Student(imie, nazwisko));
    }
    public Student getStudent(String name, String surname){
        int znalezione=0;
        for (Student i: students) {
            if (Objects.equals(i.getName(), name) && Objects.equals(i.getSurname(), surname)){
                System.out.println(i.getName()+" "+i.getSurname());
                znalezione++;
            }
        }
        if (znalezione==0){
            System.out.println("Nie ma takiego ucznia");
        }
        return null;
    }
    public boolean removeStudent(String name, String surname){
        for (Student i: students) {
            if (Objects.equals(i.getName(), name) && Objects.equals(i.getSurname(), surname)){
                System.out.println("Usunieto");
                return true;
            }
        }
        System.out.println("Nie ma takiego ucznia");
        return false;
    }

}
