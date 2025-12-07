package org.example.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserNavigationSimulator {
    private Deque<String> backStack = new ArrayDeque<>();
    private Deque<String> forwardStack = new ArrayDeque<>();
    private String currentPage = "home";

    public void visit(String url) {
        backStack.push(currentPage);
        currentPage = url;
        forwardStack.clear();
        System.out.println("Visited: " + currentPage);
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Back to: " + currentPage);
        } else {
            System.out.println("No pages in back history.");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Forward to: " + currentPage);
        } else {
            System.out.println("No pages in forward history.");
        }
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public static void main(String[] args) {
        BrowserNavigationSimulator sim = new BrowserNavigationSimulator();
        sim.visit("google.com");
        sim.visit("github.com");
        sim.back();
        sim.forward();
        sim.back();
        sim.visit("stackoverflow.com");
    }
}

