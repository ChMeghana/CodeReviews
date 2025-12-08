package org.example;

import java.io.*;
import java.util.*;

public class Main {

    public static void ArrayList1(ArrayList<Double> Employees) {
        // You are given a list of employee salaries.
        // Write a program to remove all duplicates without using a Set,
        // and then find the second highest salary.

        Collections.sort(Employees, Collections.reverseOrder());
        for (int i = Employees.size() - 1; i > 0; i--) {
            if ((Employees.get(i)).equals(Employees.get(i - 1))) {
                Employees.remove(i);
            }
        }

        System.out.println("ArrayList1");
        System.out.println(Employees);
    }

    public static void ArrayList2(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Given two ArrayList<Integer> lists A and B,
        // find their union and intersection using only List methods. (No Set or Stream API allowed)

        ArrayList<Integer> union = new ArrayList<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        for (Integer x : A) {
            union.add(x);
            if (B.contains(x) && !intersection.contains(x))
                intersection.add(x);
        }
        for (Integer y : B)
            if (!union.contains(y))
                union.add(y);

        System.out.println("Union+\n" + union);
        System.out.println("Intersection\n" + intersection);
    }


    public static void LinkedList1(LinkedList<String> operations) {
        // Implement a custom undo feature using LinkedList where
        // each operation (add/remove string) can be undone using removeLast().

        System.out.println("Before Undo: " + operations);
        if (!operations.isEmpty()) {
            operations.removeLast();
        }
        System.out.println("After Undo: " + operations);
    }

    public static void LinkedList2(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        // Write a program to merge two sorted LinkedLists into a single sorted LinkedList.
        int i = 0, j = 0;
        LinkedList<Integer> list = new LinkedList<>();
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                list.add(list1.get(i++));
            } else if (list2.get(j) < list1.get(i)) {
                list.add(list2.get(j++));
            } else {
                list.add(list1.get(i++));
                list.add(list2.get(j++));
            }
        }
        while (j < list2.size())
            list.add(list2.get(j++));
        while (i < list1.size())
            list.add(list1.get(i++));

        System.out.println("Merge LinkedList\n" + list);
    }

    public static void findFirstRepeatedWord(String paragraph) {
        // Given a large paragraph, find the first repeated word using a HashSet
        HashSet<String> uniqueWords = new HashSet<>();
        String[] para = paragraph.toLowerCase().split("\\W+");
        for (String word : para) {
            if (uniqueWords.contains(word)) {
                System.out.println("First repeated word in a para:  " + word);
                return;
            } else {
                uniqueWords.add(word);
            }
        }
    }

    public static void checkAnagram(String str1, String str2) {
        // Write a function that determines if two strings are anagrams by comparing their character sets
        //here we are ignoring the count of the characters
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for (int i = 0; i < str1.length(); i++) {
            set1.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            set2.add(str2.charAt(i));
        }
        if (set1.equals(set2))
            System.out.println(" Anagrams: " + str1 + " " + str2);
        else
            System.out.println("Not Anagrams: " + str1 + " " + str2);
        return;
    }

    public static void printTransactionRange(TreeSet<Integer> transactions) {
        // Given a list of transaction amounts, store them in a TreeSet
        // and print all values between 10,000 and 50,000 using subSet()
        TreeSet<Integer> subSet = (TreeSet<Integer>) transactions.subSet(10001, 50000);
        Iterator iterator = subSet.iterator();
        System.out.println("Transactions between 10000 & 50000");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void nextHigherSeat(TreeSet<Integer> seats, int bookedSeat) {
        // Write a program to find the next higher available seat number in a TreeSet<Integer>
        // after a customer books a specific seat. (Uses higher())
        System.out.println("Higher element after " + bookedSeat + " is " + seats.higher(bookedSeat));
        return;
    }

    public static void top5FrequentWords(String fileName) throws FileNotFoundException {
        // Write a program to count word frequencies in a file and display the top 5 most frequent words
        Map<String, Integer> map = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        int i = 0;
        System.out.println("Frequency of top 5 elements");
        for (Map.Entry<String, Integer> entry : sortedList) {
            if (i > 4)
                return;
            System.out.print(entry.getKey() + " " + entry.getValue() + "\t");
            i++;
        }
        System.out.println();

    }

    public static void removeLowStock(HashMap<String, Integer> products) {
        // Given a HashMap<String, Integer> representing product → stock count,
        // remove all entries where stock is below 10
        Iterator<Map.Entry<String, Integer>> iterator = products.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 10)
                iterator.remove();
        }

        System.out.println(products);
    }

    public static void printReadingsInRange(TreeMap<Long, Double> readings, long start, long end) {
        // Maintain a record of timestamps (Long) vs sensor readings in a TreeMap
        // Print all readings between two given timestamps using subMap()

        System.out.println("printReadingsInRange");
        System.out.println(readings.subMap(start + 1, end));
    }

    public static void printStudentsInRange(TreeMap<Integer, String> marks, int min, int max) {
        // Implement a range-based search for marks using a TreeMap<Integer, String>
        // Print all students scoring between min and max
        for (Map.Entry<Integer, String> entry : marks.subMap(min, max).entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return;
    }

    static final int CACHE_SIZE = 5;

    // LinkedHashMap with accessOrder = true enables automatic LRU ordering
    static LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>(CACHE_SIZE, 0.75f, true) {
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > CACHE_SIZE; // Remove Least Recently Used item
        }
    };

    // GET operation
    public static int LRUget(int key) {
        return cache.getOrDefault(key, -1);
    }

    // PUT operation
    public static void LRUput(int key, int value) {
        cache.put(key, value);
    }

    public static void simulateLRUCache(int[] input) {
        for (int key : input) {
            if (LRUget(key) == -1) {
                System.out.println("Cache MISS → Insert: " + key);
                LRUput(key, key * 10); // Arbitrary value for example
            } else {
                System.out.println("Cache HIT → Access: " + key);
                LRUput(key, cache.get(key)); // Update usage order
            }
            System.out.println("Cache: " + cache);
        }
    }


    static LinkedHashMap<String, Integer> apiCallOrder = new LinkedHashMap<>(10, 0.75f, true);
    public static void accessAPI(String apiName) {
        apiCallOrder.put(apiName,
                apiCallOrder.getOrDefault(apiName, 0) + 1); // increment count

        System.out.println("Accessed: " + apiName);
        return;
    }
    public static void simulateAPICallOrder() {
        // Maintain a LinkedHashMap of API call order
        // After each access, re-order to reflect most recent calls using accessOrder=true

        accessAPI("/login");
        accessAPI("/cart");
        accessAPI("/login");    // moved to end
        accessAPI("/checkout");
        accessAPI("/products");
        accessAPI("/products");

        System.out.println("API Access Order: " + apiCallOrder);

    }

    public static void evaluatePostfix(String expression) {
        // Write a program to evaluate a postfix (Reverse Polish) expression using a Stack<Integer>
        Stack<Integer> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                if (ch == '+') stack.push(a + b);
                else if (ch == '-') stack.push(a - b);
                else if (ch == '*') stack.push(a * b);
                else if (ch == '/') stack.push(a / b);
            }
        }
        System.out.println("Postfix Evaluation: " + stack.pop());
    }

    public static void infixToPostfix(String expression) {
        // Implement a program to convert an infix expression to postfix using stack precedence rules
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char ch : expression.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result.append(stack.pop());
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch))
                    result.append(stack.pop());
                stack.push(ch);
            }
        }
        while (!stack.isEmpty())
            result.append(stack.pop());
        System.out.println("Postfix: " + result);
    }

    public static int precedence(char ch) {
        if (ch == '*' || ch == '/') return 2;
        if (ch == '+' || ch == '-') return 1;
        return 0;
    }


    public static void mergeKSortedArrays(List<int[]> arrays) {
        // Write a program to merge k sorted arrays using a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int[] arr : arrays) {
            for (int num : arr) {
                pq.add(num);
            }
        }
        System.out.print("Merged Sorted Array: ");
        while (!pq.isEmpty())
            System.out.print(pq.poll() + " ");
        System.out.println();
    }

    public static void checkPalindrome(String str) {
        // Check if a given string is a palindrome using an ArrayDeque (compare first and last)
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (char ch : str.toCharArray()) {
            deque.add(ch);
        }
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                System.out.println("Not Palindrome: " + str);
                return;
            }
        }
        System.out.println("Palindrome: " + str);
    }

    public static void simulateBrowserNavigation() {
        // Simulate browser navigation (Back/Forward) using two ArrayDeque objects
        ArrayDeque<String> back = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        back.push("Google");
        back.push("YouTube");
        back.push("GitHub");

        System.out.println("Current: " + back.peek());

        forward.push(back.pop());
        System.out.println("Back → Current: " + back.peek());

        back.push("StackOverflow");
        forward.clear();

        System.out.println("Back Stack: " + back);
        System.out.println("Forward Stack: " + forward);
    }

    public static void removeOddLength(ArrayList<String> list) {
        // Iterate over an ArrayList<String> using an Iterator
        // Remove all elements whose length is odd
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().length() % 2 != 0)
                it.remove();
        }
        System.out.println("After removing odd length: " + list);
    }

    public static void sumEvenNumbers(HashSet<Integer> set) {
        // Use an Iterator to traverse a HashSet<Integer> and compute the sum of all even numbers
        // without using for-each
        int sum = 0;
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int x = it.next();
            if (x % 2 == 0) sum += x;
        }
        System.out.println("Sum of even numbers: " + sum);
    }

    public static void insertBeforeEven(ArrayList<Integer> list) {
        // Write a program to insert an element before each even number in an ArrayList using ListIterator
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            int x = it.next();
            if (x % 2 == 0) {
                it.previous();
                it.add(0);
                it.next();
            }
        }
        System.out.println("After Insert: " + list);
    }

    public static void reverseList(ArrayList<Integer> list) {
        // Reverse a list in-place using ListIterator only (no Collections.reverse())
        ListIterator<Integer> fwd = list.listIterator();
        ListIterator<Integer> rev = list.listIterator(list.size());

        while (fwd.nextIndex() < rev.previousIndex()) {
            int temp = fwd.next();
            fwd.set(rev.previous());
            rev.set(temp);
        }
        System.out.println("Reversed List: " + list);
    }

    public static void findMedian(ArrayList<Integer> list) {
        // Given an ArrayList<Integer>, use Collections methods to find the median element after sorting
        Collections.sort(list);
        int mid = list.size() / 2;
        System.out.println("Median: " + list.get(mid));
    }

    public static void shuffleAndPick(List<String> deck) {
        // Shuffle a deck of cards (List<String>) using Collections.shuffle()
        // Pick random 5 cards for a player
        Collections.shuffle(deck);
        System.out.println("Picked Cards: " + deck.subList(0, 5));
    }

    public static void sortEmployees(List<Employee> employees) {
        // Create a list of Employee(id, name, salary)
        // Sort first by descending salary, then by name alphabetically if salaries are equal
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if (e1.salary != e2.salary)
                    return Double.compare(e2.salary, e1.salary);
                return e1.name.compareTo(e2.name);
            }
        });

        System.out.println("Sorted Employees:");
        for (Employee e : employees) {
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }
    }

    public static void sortStudents(List<Student> students) {
        // Sort a list of Students by grade
        // If two students have the same grade, sort by the number of subjects they’ve taken
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (s1.grade != s2.grade)
                    return Integer.compare(s2.grade, s1.grade);
                return Integer.compare(s2.subjects.size(), s1.subjects.size());
            }
        });

        System.out.println("Sorted Students:");
        for (Student s : students) {
            System.out.println(s.name + " " + s.grade + " " + s.subjects.size());
        }
    }

    static class Employee {
        int id;
        String name;
        double salary;
        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    }

    static class Student {
        String name;
        int grade;
        List<String> subjects;
        Student(String name, int grade, List<String> subjects) {
            this.name = name;
            this.grade = grade;
            this.subjects = subjects;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Double> employeeSalaries = new ArrayList<>(Arrays.asList(55000.0, 72000.0, 55000.0, 86000.0, 72000.0, 94000.0));
        ArrayList1(employeeSalaries);

        ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));
        ArrayList2(listA, listB);

        LinkedList<String> operations = new LinkedList<>(Arrays.asList("Add: John", "Add: Mary", "Remove: John", "Add: Steve"));
        LinkedList1(operations);

        LinkedList<Integer> sortedList1 = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
        LinkedList<Integer> sortedList2 = new LinkedList<>(Arrays.asList(2, 4, 6, 8));
        LinkedList2(sortedList1, sortedList2);

        findFirstRepeatedWord("This is a test this is only a test");

        checkAnagram("listten", "sileent");

        TreeSet<Integer> transactions = new TreeSet<>(Arrays.asList(5000, 15000, 30000, 60000, 45000));
        printTransactionRange(transactions);

        TreeSet<Integer> seats = new TreeSet<>(Arrays.asList(1, 2, 4, 5, 7, 9));
        nextHigherSeat(seats, 5);

        top5FrequentWords("D:\\Atlanta Consultancy\\Java\\Collections\\src\\main\\java\\org\\example\\input.txt");
        System.out.println();
//
        HashMap<String, Integer> products = new HashMap<>();
        products.put("Shoes", 5);
        products.put("Bags", 12);
        products.put("Watches", 8);
        removeLowStock(products);

        TreeMap<Long, Double> readings = new TreeMap<>();
        readings.put(100L, 22.5);
        readings.put(200L, 23.1);
        readings.put(300L, 24.0);
        printReadingsInRange(readings, 150L, 300L);

        TreeMap<Integer, String> marks = new TreeMap<>();
        marks.put(75, "Alice");
        marks.put(85, "Bob");
        marks.put(90, "Carol");
        marks.put(96, "David");
        printStudentsInRange(marks, 70, 95);

        int[] input = {1, 2, 3, 4, 5, 3, 6, 2, 7};
        simulateLRUCache(input);
        simulateAPICallOrder();

        evaluatePostfix("23*54*+9-");
        infixToPostfix("(A+B)*C");

        List<int[]> arrays = Arrays.asList(new int[]{1, 4, 7}, new int[]{2, 5, 8}, new int[]{3, 6, 9});
        mergeKSortedArrays(arrays);

        checkPalindrome("madam");

        simulateBrowserNavigation();

        removeOddLength(new ArrayList<>(Arrays.asList("hi", "there", "yes", "no")));

        sumEvenNumbers(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)));

        insertBeforeEven(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6)));

        reverseList(new ArrayList<>(Arrays.asList(10, 20, 30, 40)));

        findMedian(new ArrayList<>(Arrays.asList(5, 1, 9, 3, 7)));

        List<String> deck = new ArrayList<>(Arrays.asList("A♠", "K♠", "Q♠", "J♠", "10♠", "9♠"));
        shuffleAndPick(deck);

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 90000),
                new Employee(2, "Bob", 85000),
                new Employee(3, "Charlie", 90000)
        );
        sortEmployees(employees);

        List<Student> students = Arrays.asList(
                new Student("Tom", 90, Arrays.asList("Math", "Science")),
                new Student("Jerry", 90, Arrays.asList("Math")),
                new Student("Anna", 85, Arrays.asList("English", "History", "Science"))
        );
        sortStudents(students);
    }
}
