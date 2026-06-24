package LibrarySystem;

import java.util.Scanner;

public class Menu {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        LibraryService libraryService = new LibraryService();
        String command = scanner.nextLine();
        Book book;
        User user;
        while (!command.equals("Stop")){
            switch (command){
                case "Add book":
                    book = new Book(scanner.nextLine(), scanner.nextLine());
                    libraryService.addBook(book);
                    break;
                case "Add user":
                    user = new User(scanner.nextLine());
                    libraryService.addUser(user);
                    break;
                case "Show all books":
                    for (Book b : libraryService.getAllBooks()) {
                        System.out.printf("%s from %s\n", b.getTitle(), b.getAuthor());
                    }
                    break;
                case "Show available books":
                    for (Book availableBook : libraryService.getAvailableBooks()) {
                        System.out.printf("%s form %s is available\n", availableBook.getTitle(), availableBook.getAuthor());
                    }
                case "Borrow book":
                    libraryService.borrowBook(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
                    break;
                case "Return book":
                    libraryService.returnBook(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
                    break;
                case "Show users":
                    for (User u : libraryService.getAllUsers()) {
                        System.out.println(u.getName());
                    }

            }
            command = scanner.nextLine();
        }
    }
}
