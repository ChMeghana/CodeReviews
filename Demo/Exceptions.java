import java.io.*;                   // FileNotFoundException, IOException
import java.sql.*;                  // SQLException
import java.net.*;                  // MalformedURLException
import java.text.*;                 // ParseException
import java.util.*;                 // NoSuchElementException, InputMismatchException

public class Exceptions {

    public static void main(String[] args) {
        System.out.println("===== CHECKED EXCEPTIONS =====");
        fileNotFoundExample();
        ioExceptionExample();
        classNotFoundExample();
        sqlExceptionExample();
        malformedUrlExample();
        interruptedExceptionExample();
        parseExceptionExample();

        System.out.println("\n===== UNCHECKED EXCEPTIONS =====");
        nullPointerExample();
        arrayIndexExample();
        stringIndexExample();
        numberFormatExample();
        arithmeticExceptionExample();
        illegalArgumentExample();
        illegalStateExample();
        classCastExample();
        noSuchElementExample();
        inputMismatchExample();
    }

    // ---------- CHECKED EXCEPTIONS ----------

    static void fileNotFoundExample() {
        try {
            FileInputStream file = new FileInputStream("missing.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: File not found");
        }
    }

    static void ioExceptionExample() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("missing.txt"));
            reader.readLine();
        } catch (IOException e) {
            System.out.println("IOException: IO operation failed");
        }
    }

    static void classNotFoundExample() {
        try {
            Class.forName("com.unknown.ClassName");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: Class not found");
        }
    }

    static void sqlExceptionExample() {
        try {
            throw new SQLException("Database error occurred");
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }

    static void malformedUrlExample() {
        try {
            URL url = new URL("ht!tp://badurl");
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException: Invalid URL format");
        }
    }

    static void interruptedExceptionExample() {
        try {
            Thread.sleep(100); // Thread waiting
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Thread interrupted");
        }
    }

    static void parseExceptionExample() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            sdf.parse("31-02-2024"); // invalid date
        } catch (ParseException e) {
            System.out.println("ParseException: Invalid date format");
        }
    }

    // ---------- UNCHECKED EXCEPTIONS ----------

    static void nullPointerExample() {
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Null object access");
        }
    }

    static void arrayIndexExample() {
        try {
            int[] arr = new int[3];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array access");
        }
    }

    static void stringIndexExample() {
        try {
            String s = "Java";
            System.out.println(s.charAt(10)); // invalid index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: Invalid string index");
        }
    }

    static void numberFormatExample() {
        try {
            int x = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Cannot convert string to number");
        }
    }

    static void arithmeticExceptionExample() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero");
        }
    }

    static void illegalArgumentExample() {
        try {
            setSalary(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }

    static void illegalStateExample() {
        try {
            getConnection(true);
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException: " + e.getMessage());
        }
    }

    static void classCastExample() {
        try {
            Object obj = new Integer(100);
            String s = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: Invalid type casting");
        }
    }

    static void noSuchElementExample() {
        try {
            ArrayList<Integer> list = new ArrayList<>();
            Iterator<Integer> it = list.iterator();
            it.next(); // no element
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException: No element found");
        }
    }

    static void inputMismatchExample() {
        try {
            Scanner sc = new Scanner("abc");
            sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Invalid input type");
        }
    }

    // -------- Helper Methods --------

    static void setSalary(int salary) {
        if (salary < 0) throw new IllegalArgumentException("Salary must be positive");
    }

    static void getConnection(boolean connected) {
        if (connected) throw new IllegalStateException("Connection already open");
    }
}