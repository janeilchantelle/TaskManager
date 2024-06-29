import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenuHeader();

        while (true) {
            System.out.println("\u001B[35m1. Create username\u001B[0m");
            System.out.println("\u001B[34m2. Add task to username\u001B[0m");
            System.out.println("\u001B[36m3. Mark task as done\u001B[0m");
            System.out.println("\u001B[35m4. View tasks for user\u001B[0m");
            System.out.println("\u001B[34m5. Exit\u001B[0m");
            int choice = getValidChoice(scanner);

            switch (choice) {
                case 1:
                    createUser(scanner);
                    break;
                case 2:
                    addTaskToUser(scanner);
                    break;
                case 3:
                    markTaskAsDone(scanner);
                    break;
                case 4:
                    viewTasksForUser(scanner);
                    break;
                case 5:
                    System.out.println("Thank you for using Task Master. Have a productive day! :)");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again :)");
            }
        }
    }

    private static void createUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String userName = scanner.nextLine();
        users.add(new User(userName));
        System.out.println("Hello " + userName + "! Let's get a task list started!");
    }

    private static void addTaskToUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String userName = scanner.nextLine();
        User user = findUserByName(userName);
        if (user != null) {
            System.out.print("What task would you like to complete today? ");
            String description = scanner.nextLine();
            user.addToDo(description);
            System.out.println("Task '" + description + "' added for " + userName + ".");
        } else {
            System.out.println("User not found.");
        }
    }

    private static void markTaskAsDone(Scanner scanner) {
        System.out.print("Enter username: ");
        String userName = scanner.nextLine();
        User user = findUserByName(userName);
        if (user != null) {
            System.out.println("Tasks for " + userName + ":");
            user.printToDos();
            System.out.print("Enter task description to mark as done: ");
            String description = scanner.nextLine();
            user.markToDoAsDone(description);
            System.out.println("Task '" + description + "' marked as done for " + userName + ".");
        } else {
            System.out.println("User not found.");
        }
    }

    private static void viewTasksForUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String userName = scanner.nextLine();
        User user = findUserByName(userName);
        if (user != null) {
            System.out.println("Tasks for " + userName + ":");
            user.printToDos();
        } else {
            System.out.println("User not found.");
        }
    }

    private static User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
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

    private static int getValidChoice(Scanner scanner) {
        int choice;
        while (true) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice >= 1 && choice <= 5) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } else {
                scanner.nextLine();
                System.out.println("Invalid choice. Please enter a number.");
            }
        }
        return choice;
    }
}
