import java.util.LinkedList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> operations = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add string");
            System.out.println("2. Remove string");
            System.out.println("3. Undo last operation");
            System.out.println("4. Show current list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter string to add: ");
                    String addStr = sc.nextLine();
                    operations.add("Added: " + addStr);
                    System.out.println(addStr + " added successfully.");
                    break;

                case 2:
                    System.out.print("Enter string to remove: ");
                    String remStr = sc.nextLine();
                    operations.add("Removed: " + remStr);
                    System.out.println(remStr + " removed successfully.");
                    break;

                case 3:
                    if (!operations.isEmpty()) {
                        String last = operations.removeLast();
                        System.out.println("Undo performed: " + last);
                    } else {
                        System.out.println("Nothing to undo.");
                    }
                    break;

                case 4:
                    System.out.println("Current operation history: " + operations);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
