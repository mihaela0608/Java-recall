package FitnessWorkoutTracker.data;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static int ID = 0;
    private int id;
    private String name;
    private int age;
    private List<Workout> workouts;

    public User(String name, int age) {
        this.id = ++ID;
        this.name = name;
        this.age = age;
        this.workouts = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }
}
