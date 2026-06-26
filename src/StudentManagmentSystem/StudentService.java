package StudentManagmentSystem;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addGrade(int facNum, Double grade){
        students.stream().filter(s -> s.getFacNum() == facNum).toList().get(0).getGrades().add(grade);
    }

    public void showAllStudents(){
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.printf("%s %s %d\n", student.getFirstName(), student.getLastName(), student.getFacNum());
        }
    }

    public void showStudentDetails(int facNum){
        Student student = students.stream().filter(s -> s.getFacNum() == facNum).toList().get(0);
        System.out.printf("%s %s %d with average grade\n", student.getFirstName(), student.getLastName(), student.getFacNum(), averageGrade(student));
    }

    public void showTopStudent(){
        double biggest = 0;
        int ind = 0;
        for (int i = 0; i < students.size(); i++) {
            if (biggest < averageGrade(students.get(i))){
                biggest = averageGrade(students.get(i));
                ind = i;
            }
        }
        Student student = students.get(ind);
        System.out.printf("%s %s %d with average grade\n", student.getFirstName(), student.getLastName(), student.getFacNum(), averageGrade(student));
    }

    public void showStudentsAboveGrade(Double grade){
        for (int i = 0; i < students.size(); i++) {
            if (averageGrade(students.get(i)) > grade){
                Student student = students.get(i);
                System.out.printf("%s %s %d with average grade %.2f\n", student.getFirstName(), student.getLastName(), student.getFacNum(), averageGrade(student));
            }
        }
    }

    public void removeStudent(int facNum){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFacNum() == facNum){
                students.remove(i);
                break;
            }
        }
    }

    public void showExcellent(){
        showStudentsAboveGrade(5.50);
    }

    public void statistics(){
        double max = 0;
        double min = Double.MAX_VALUE;
        double sum = 0;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            double averageGrade = averageGrade(student);
            if (averageGrade > max){
                max = averageGrade;
            } else if (averageGrade < min) {
                min = averageGrade;
            }
            sum+=averageGrade;
        }
        System.out.printf("Students: %d\n", students.size());
        System.out.printf("Average grade in system: %.2f\n", sum / students.size());
        System.out.printf("Highest average: %.2f\n", max);
        System.out.printf("Lowest average: %.2f\n", min);
    }

    private double averageGrade(Student student){
        double sum = 0;

        for (Double g : student.getGrades()) {
            sum += g;
        }

        return sum / student.getGrades().size();
    }


}
