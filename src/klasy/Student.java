package klasy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Student {
    private String name;
    private String surname;
    private LocalDate birthdate;
    private int sciencePoints=0;
    private int lifePoints=0;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void learn(LocalDate from, LocalDate to){
        int dni = (int) ChronoUnit.DAYS.between(from, to);
        sciencePoints=sciencePoints+2*dni;
    }
    public void party(LocalDate from, LocalDate to){
        int dni = (int) ChronoUnit.DAYS.between(from, to);
        lifePoints=lifePoints+5*dni;
    }
    public boolean isGoodStudent(){
        return sciencePoints >= lifePoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
