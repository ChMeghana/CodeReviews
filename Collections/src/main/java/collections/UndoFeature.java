package collections;
import java.util.LinkedList;
import java.util.Scanner;

public class UndoFeature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>(); // stores strings
        LinkedList<String> history = new LinkedList<>(); // stores actions

        while (true) {
            System.out.println("\nChoose an action: add / remove / undo / show / exit ");
            String action = sc.nextLine().trim().toLowerCase();

            switch (action) {
                case "add":
                    System.out.print("Enter string to add: ");
                    String addItem = sc.nextLine();
                    list.add(addItem);
                    history.add("add:" + addItem);
                    System.out.println(addItem + " added.");
                    break;

                case "remove":
                    System.out.print("Enter string to remove: ");
                    String removeItem = sc.nextLine();
                    if (list.remove(removeItem)) {
                        history.add("remove:" + removeItem);
                        System.out.println(removeItem + " removed.");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case "undo":
                    if (history.isEmpty()) {
                        System.out.println("Nothing to undo!");
                    } else {
                        String lastAction = history.removeLast();
                        String[] parts = lastAction.split(":");
                        String type = parts[0];
                        String value = parts[1];

                        if (type.equals("add")) {
                            list.removeLastOccurrence(value);
                            System.out.println("Undo add: removed \"" + value + "\"");
                        } else if (type.equals("remove")) {
                            list.add(value);
                            System.out.println("Undo remove: added \"" + value + "\"");
                        }
                    }
                    break;

                case "show":
                    System.out.println("Current list: " + list);
                    break;

                case "exit":
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid action.");
            }
        }
    }
}

