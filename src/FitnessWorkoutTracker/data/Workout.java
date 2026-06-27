package FitnessWorkoutTracker.data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Workout {
    private static int ID = 0;
    private int id;
    private LocalDateTime date;
    private WORKOUT_TYPE type;
    private List<Exercise> exercises;

    public Workout(WORKOUT_TYPE type) {
        this.id = ++ID;
        this.date = LocalDateTime.now();
        this.type = type;
        this.exercises = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public WORKOUT_TYPE getType() {
        return type;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }
}
