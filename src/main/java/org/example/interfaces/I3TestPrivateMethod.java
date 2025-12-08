package org.example.interfaces;
interface Utils {

    // Private instance method - reusable by default methods
    private void log(String msg) {
        System.out.println("[LOG] " + msg);
    }

    // Private static method - reusable by static methods
    private static void staticLog(String msg) {
        System.out.println("[STATIC LOG] " + msg);
    }

    default void processA() {
        log("Process A started");
    }

    default void processB() {
        log("Process B started");
    }

    static void help() {
        staticLog("Help invoked");
    }
}

public class I3TestPrivateMethod {
    public static void main(String[] args) {
        Utils u = new Utils() {};
        u.processA();
        u.processB();

        Utils.help();
    }
}
