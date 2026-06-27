package FitnessWorkoutTracker.data;

public class Exercise {
    private String name;
    private int duration;
    private int caloriesBurnt;

    public Exercise(String name, int duration, int caloriesBurnt) {
        this.name = name;
        this.duration = duration;
        this.caloriesBurnt = caloriesBurnt;
    }

    public int getCaloriesBurnt() {
        return caloriesBurnt;
    }
}
