package Streams;

import StudentManagmentSystem.Student;

import java.util.*;

public class Home {
    static void main() {

    }

    public void studentWithMaxGrades(List<Student> students){
        final int[] max = {0};
        final int[] ind = {0};
        Student student;
        students.forEach(s -> {
            if (s.getGrades().size() > max[0]){
                max[0] = s.getGrades().size();
                ind[0] = s.getId();
            }
        });
        Optional<Student> first = students.stream().filter(s -> s.getId() == ind[0]).findFirst();
        System.out.println(first.get());
    }

    public void studentsWithMoreThan3Grades(List<Student> students){
        students.stream().filter(s -> s.getGrades().size() > 3).forEach(System.out::println);
    }

    public void uniqueGrades(List<Student> students){
        Set<Double> grades = new HashSet<>();
        students.stream().map(s -> s.getGrades()).forEach(g -> {
            grades.addAll(g);
        });
        grades.stream().forEach(System.out::println);
    }
}
