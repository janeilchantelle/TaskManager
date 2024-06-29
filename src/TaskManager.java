import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenuHeader();

            System.out.println("\u001B[35m1. Create username\u001B[0m");  // Pink text
            System.out.println("\u001B[34m2. Add task to username\u001B[0m");  // Blue text
            System.out.println("\u001B[36m3. Mark task as done\u001B[0m");  // Cyan text
            System.out.println("\u001B[35m4. View tasks for user\u001B[0m");  // Pink text
            System.out.println("\u001B[34m5. Exit\u001B[0m");  // Blue text

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline after nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String userName = scanner.nextLine();
                    users.add(new User(userName));  // Create a new User object
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    userName = scanner.nextLine();
                    User user = findUserByName(userName);
                    if (user != null) {
                        System.out.print("Enter task description: ");
                        String description = scanner.nextLine();
                        user.addToDo(description);  // Add a task to the user's list
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter username: ");
                    userName = scanner.nextLine();
                    user = findUserByName(userName);
                    if (user != null) {
                        System.out.print("Enter task description to mark as done: ");
                        String description = scanner.nextLine();
                        user.markToDoAsDone(description);  // Mark a task as done for the user
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter username: ");
                    userName = scanner.nextLine();
                    user = findUserByName(userName);
                    if (user != null) {
                        user.printToDos();  // Print all tasks for the user
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 5:
                    scanner.close();
                    return;  // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again :)");
            }
        }
    }

    private static User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;  // User not found
    }

    private static void printMenuHeader() {
        System.out.println("\u001B[35m*************************************************************************\u001B[0m");
        System.out.println("\u001B[35m*************************************************************************\u001B[0m");
        System.out.println("\u001B[35m      _______,   __, __  ,   _ _ _    _,   __, ____________ _ __    \u001B[0m");
        System.out.println("\u001B[34m     (  /  / |  (   ( /,/   ( / ) )  / |  (   (  /  (  /   ( /  )  \u001B[0m");
        System.out.println("\u001B[36m       /  /--|   `.  /<      / / /  /--|   `.   /     /--   /--<   \u001B[0m");
        System.out.println("\u001B[35m     _/ _/   |_(___)/  \\_   / / (__/   |_(___)_/    (/____//   \\_\u001B[0m");
        System.out.println("\u001B[34m          WELCOME TO TASK MASTER - YOUR TO DO LIST MANAGER!     \u001B[0m");
        System.out.println("\u001B[35m*************************************************************************\u001B[0m");
        System.out.println("\u001B[35m*************************************************************************\u001B[0m");
        System.out.println();
    }
}

