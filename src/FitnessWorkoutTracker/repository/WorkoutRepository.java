package FitnessWorkoutTracker.repository;

import FitnessWorkoutTracker.data.Workout;

import java.util.ArrayList;
import java.util.List;

public class WorkoutRepository {
    private List<Workout> workouts;

    public WorkoutRepository(){
        this.workouts = new ArrayList<>();
    }

    public void addWorkout(Workout workout){
        workouts.add(workout);
    }

    public Workout findById(int id){
        return workouts.stream().filter(w -> w.getId() == id).findFirst().get();
    }

    public List<Workout> getAll(){
        return workouts;
    }
}
