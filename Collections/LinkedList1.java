import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {
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
                    System.out.println("Enter a string: ");
                    String addstr=sc.nextLine();
                    operations.add("Added " +addstr);
                    System.out.println("Successfully added "+addstr);
                    break;

                case 2:
                    System.out.println("Enter the String which need to be Removed ");
                    String rmstr=sc.nextLine();
                    if(operations.isEmpty()){
                        System.out.println("You need to add at least one operation");
                        break;
                    }
                    if(operations.contains(rmstr)){
                    operations.remove("Removed " + rmstr);
                    System.out.println("Successfully removed "+ rmstr);
                    }else{
                        System.out.println(rmstr + " is not a present in operation");
                    }

                    break;

                case 3:

                    if(!operations.isEmpty()){
                        String undo=operations.removeLast();
                        System.out.println("Successfully performed undo operation on "+ undo);

                    }else System.out.println("You need to add at least one operation");
                    break;

                case 4:
                    System.out.println("Current list: "+operations);
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
