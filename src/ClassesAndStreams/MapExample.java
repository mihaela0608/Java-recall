package ClassesAndStreams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> data = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            data.put(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
        }

        data.keySet().stream()
                .filter(k -> data.get(k) < 5)
                .forEach(k -> System.out.printf("%d\n", data.get(k)));
    }
}
