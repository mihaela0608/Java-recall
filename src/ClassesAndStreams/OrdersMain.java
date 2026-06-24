package ClassesAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdersMain {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String id = scanner.nextLine();
            String name = scanner.nextLine();
            double quantity = Double.parseDouble(scanner.nextLine());
            String status = scanner.nextLine();
            Order order = new Order(id, name, quantity, status);
            orders.add(order);
        }


        orders.stream()
                .filter(o -> o.getAmount() < 10)
                .forEach(System.out::println);

    }
}
