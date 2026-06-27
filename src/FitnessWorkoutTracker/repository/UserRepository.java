package FitnessWorkoutTracker.repository;

import FitnessWorkoutTracker.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }



    public void addUser(User user){
        users.add(user);
    }

    public void deleteUser(User user){
        users.remove(user);
    }

    public List<User> getAll(){
        return users;
    }

    public User findById(int id){
        if (users.stream().anyMatch(u -> u.getId() == id)){
            return users.stream().filter(u -> u.getId() == id).findFirst().get();
        } else{
            System.out.println("No such user");
            return null;
        }
    }
}
