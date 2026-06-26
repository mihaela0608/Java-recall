package Generics;

public class Home {
    static void main() {
        Integer[] numbers = {1, 2, 8};
        printArray(numbers);
    }

    public static <T> void printArray(T[] array){
        for (T item: array){
            System.out.println(item);
        }
    }
}
