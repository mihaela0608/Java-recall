package FitnessWorkoutTracker.service;

import FitnessWorkoutTracker.data.User;
import FitnessWorkoutTracker.data.Workout;
import FitnessWorkoutTracker.repository.UserRepository;
import FitnessWorkoutTracker.repository.WorkoutRepository;

import java.util.Scanner;

public class UserService {
    private UserRepository userRepository;
    private Scanner scanner;

    public UserService(){
        this.userRepository = new UserRepository();
        this.scanner = new Scanner(System.in);
    }



    public void registerUser(){
        User user = new User(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
        userRepository.addUser(user);
    }

    public void addWorkoutToUser(Workout workout){
        userRepository.findById(Integer.parseInt(scanner.nextLine())).getWorkouts().add(workout);
    }

    public String getUserStats(){
        User user = userRepository.findById(Integer.parseInt(scanner.nextLine()));
        String stats = String.format("%s is %d years old with %d workouts", user.getName(), user.getAge(), user.getWorkouts().size());
        return stats;
    }


}
