package Arrays;

public class A2 {
    static void main() {
        String[] words = {"abs", "gym", "healthy", "vo2", "jogging"};
        String word = "abs";
        boolean isPresent = false;
        for (int i = 0; i < words.length; i++) {
            if (word.equals(words[i])){
                isPresent = true;
            }
        }

        if(isPresent){
            System.out.println("The word is in the array");
        } else {
            System.out.println("There is no such word in array");
        }
    }
}
