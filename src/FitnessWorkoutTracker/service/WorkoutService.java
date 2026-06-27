package FitnessWorkoutTracker.service;

import FitnessWorkoutTracker.data.Exercise;
import FitnessWorkoutTracker.data.WORKOUT_TYPE;
import FitnessWorkoutTracker.data.Workout;
import FitnessWorkoutTracker.repository.WorkoutRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkoutService {
    private WorkoutRepository workoutRepository;
    private Scanner scanner;

    public WorkoutService() {
        this.workoutRepository = new WorkoutRepository();
        this.scanner = new Scanner(System.in);
    }


    public int totalCalories(){
        Workout workout = workoutRepository.findById(Integer.parseInt(scanner.nextLine()));
        int calories = 0;
        for(Exercise exercise: workout.getExercises()){
            calories+=exercise.getCaloriesBurnt();
        }
        return calories;
    }

    public List<Workout> workoutsByType(WORKOUT_TYPE workoutType){
        List<Workout> byType = workoutRepository.getAll().stream().filter(w -> w.getType() == workoutType).toList();
        return byType;
    }

    public Workout getLongestWorkout(){
        Workout workout = null;
        int max = 0;
        for (Workout temp: workoutRepository.getAll()){
            int sum = 0;
            for (Exercise ex: temp.getExercises()){
                sum+=ex.getCaloriesBurnt();
            }
            if (sum > max){
                max = sum;
                workout = temp;
            }
        }
        return workout;
    }


}
