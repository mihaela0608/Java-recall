package StudentManagmentSystem;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private static int ID = 0;
    private int id;
    private String firstName;
    private String lastName;
    private int facNum;
    private List<Double> grades;

    public Student(String firstName, String lastName, int facNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.facNum = facNum;
        this.grades = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getFacNum() {
        return facNum;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
