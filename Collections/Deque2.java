package Collections;


import java.util.ArrayDeque;

public class Deque2 {

    private ArrayDeque<String> backStack = new ArrayDeque<>();
    private ArrayDeque<String> forwardStack = new ArrayDeque<>();
    private String currentPage = "Home";

    public void visit(String url) {
        backStack.push(currentPage);
        currentPage = url;
        forwardStack.clear();
        System.out.println("Visited: " + currentPage);
    }

    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("No pages in Back history");
            return;
        }
        forwardStack.push(currentPage);
        currentPage = backStack.pop();
        System.out.println("Back to: " + currentPage);
    }

    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No pages in Forward history");
            return;
        }
        backStack.push(currentPage);
        currentPage = forwardStack.pop();
        System.out.println("Forward to: " + currentPage);
    }

    public static void main(String[] args) {
        Deque2 browser = new Deque2();

        browser.visit("google.com");
        browser.visit("youtube.com");
        browser.visit("github.com");

        browser.back();
        browser.back();
        browser.forward();
        browser.visit("stackoverflow.com");
        browser.back();
    }
}
