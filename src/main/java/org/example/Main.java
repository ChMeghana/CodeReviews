package org.example;

import java.io.*;
import java.util.*;

public class Main {

    public static void ArrayList1(ArrayList<Double> Employees) {
        // You are given a list of employee salaries.
        // Write a program to remove all duplicates without using a Set,
        // and then find the second highest salary.

       Collections.sort(Employees,Collections.reverseOrder());
       for(int i=Employees.size()-1;i>0;i--)
       {
           // System.out.println(Employees.get(i)+" "+Employees.get(i-1));
           if((Employees.get(i)).equals(Employees.get(i-1)))
           {
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

       for(Integer x: A)
       {
           union.add(x);
           if(B.contains(x) && !intersection.contains(x))
               intersection.add(x);
       }
       for(Integer y:B)
           if(!union.contains(y))
               union.add(y);


       System.out.println("Union+\n"+union);
       System.out.println("Intersection\n"+intersection);
    }


    public static void LinkedList1(LinkedList<String> operations) {
        // Implement a custom undo feature using LinkedList where
        // each operation (add/remove string) can be undone using removeLast().



    }

    public static void LinkedList2(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        // Write a program to merge two sorted LinkedLists into a single sorted LinkedList.
        int i=0,j=0;
        LinkedList<Integer> list=new LinkedList<>();
        while(i<list1.size() && j<list2.size())
        {
            if(list1.get(i)<list2.get(j))
            {
                list.add(list1.get(i++));
            }
            else if(list2.get(j)<list1.get(i))
            {
                list.add(list2.get(j++));
            }
            else {
                list.add(list1.get(i++));
                list.add(list2.get(j++));
            }
        }
        while(j<list2.size())
            list.add(list2.get(j++));
        while(i<list1.size())
            list.add(list1.get(i++));

        System.out.println("Merge LinkedList\n"+list);
    }
    public static void findFirstRepeatedWord(String paragraph) {
        // Given a large paragraph, find the first repeated word using a HashSet
        HashSet<String> uniqueWords=new HashSet<>();
        String[] para=paragraph.toLowerCase().split("\\W+");
        for(String word:para)
        {
            if(uniqueWords.contains(word))
            {
                System.out.println("First repeated word in a para:  "+word);
                return;
            }
            else{
                uniqueWords.add(word);
            }
        }
    }

    public static void checkAnagram(String str1, String str2) {
        // Write a function that determines if two strings are anagrams by comparing their character sets
       //here we are ignoring the count of the characters
        HashSet<Character> set1=new HashSet<>();
       HashSet<Character> set2=new HashSet<>();
       for(int i=0;i<str1.length();i++)
       {
           set1.add(str1.charAt(i));
       }
        for(int i=0;i<str2.length();i++)
        {
            set2.add(str2.charAt(i));
        }
        if(set1.equals(set2))
        System.out.println(" Anagrams: "+str1+" "+str2);
        else
            System.out.println("Not Anagrams: "+str1+" "+str2);
        return;

    }

//
//    public static void checkAnagram(String str1, String str2) {
//        // Write a function that determines if two strings are anagrams by comparing their character sets
//        int[] count1=new int[26];
//        int[] count2=new int[26];
//
//        if(str1.length()!=str2.length()) {
//
//            System.out.println("Not Anagrams: "+str1+" "+str2);
//            return;
//        }
//
//        for(int i=0;i<str1.length();i++)
//        {
//            count1[(int)(str1.charAt(i)-'a')]++;
//        }
//        for(int i=0;i<str2.length();i++)
//        {
//
//            count1[(int)(str2.charAt(i)-'a')]--;
//        }
//        for(int i=0;i<count1.length;i++)
//        {
//            if(count1[i]>0)
//            {
//                System.out.println("Not Anagrams: "+str1+" "+str2);
//                return;
//            }
//        }
//        System.out.println(" Anagrams: "+str1+" "+str2);
//        return;
//
//    }
//

    public static void printTransactionRange(TreeSet<Integer> transactions) {
        // Given a list of transaction amounts, store them in a TreeSet
        // and print all values between 10,000 and 50,000 using subSet()
        TreeSet<Integer> subSet=new TreeSet<>();
        subSet= (TreeSet<Integer>) transactions.subSet(10001,50000);
        Iterator iterator=subSet.iterator();
        System.out.println("Transactions between 10000 & 50000");
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }

    public static void nextHigherSeat(TreeSet<Integer> seats, int bookedSeat) {
        // Write a program to find the next higher available seat number in a TreeSet<Integer>
        // after a customer books a specific seat. (Uses higher())
        System.out.println("Higher element after "+bookedSeat+" is "+ seats.higher(bookedSeat));
        return;
    }

    public static void top5FrequentWords(String fileName) throws FileNotFoundException {
        // Write a program to count word frequencies in a file and display the top 5 most frequent words
        Map<String,Integer> map=new HashMap<>();
        try {
            BufferedReader reader=new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine())!= null)
            {
                line=line.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
                String[] words=line.split("\\s+");
                for(String word:words)
                {
                    if(!word.isEmpty())
                    {
                        map.put(word,map.getOrDefault(word,0)+1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<Map.Entry<String,Integer>> sortedList=new ArrayList<>(map.entrySet());
        sortedList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        int i=0;
        System.out.println("Frequency of top 5 elements");
        for(Map.Entry<String, Integer> entry: sortedList)
        {
            if(i>4)
                return;
            System.out.print(entry.getKey()+" "+ entry.getValue()+"\t");
            i++;
        }
        System.out.println();

    }

    public static void removeLowStock(HashMap<String, Integer> products) {
        // Given a HashMap<String, Integer> representing product → stock count,
        // remove all entries where stock is below 10
        Iterator<Map.Entry<String, Integer>> iterator=products.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String , Integer> entry=iterator.next();
            if(entry.getValue()<10)
                iterator.remove();
        }

        System.out.println(products);
    }

    public static void printReadingsInRange(TreeMap<Long, Double> readings, long start, long end) {
        // Maintain a record of timestamps (Long) vs sensor readings in a TreeMap
        // Print all readings between two given timestamps using subMap()

        System.out.println("printReadingsInRange");
        System.out.println(readings.subMap(start+1,end));
    }

    public static void printStudentsInRange(TreeMap<Integer, String> marks, int min, int max) {
        // Implement a range-based search for marks using a TreeMap<Integer, String>
        // Print all students scoring between min and max
        for(Map.Entry<Integer, String> entry: marks.subMap(min,max).entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        return;
    }

//
//    public static int LRUget()
//    {
//        //return -1 if not found
//        //return value if key is found
//
//    }
//
//    public static void LRUput(int key, int values)
//    {
//        //
//    }
//    public static void simulateLRUCache() {
//        // Implement a Least Recently Used (LRU) cache using LinkedHashMap
//        // Limit size to 5 and remove the oldest entry automatically
//        int size=5;
//
//    }

    public static void simulateAPICallOrder() {
        // Maintain a LinkedHashMap of API call order
        // After each access, re-order to reflect most recent calls using accessOrder=true
    }

    public static void evaluatePostfix(String expression) {
        // Write a program to evaluate a postfix (Reverse Polish) expression using a Stack<Integer>
    }

    public static void infixToPostfix(String expression) {
        // Implement a program to convert an infix expression to postfix using stack precedence rules
    }

    public static void mergeKSortedArrays(List<int[]> arrays) {
        // Write a program to merge k sorted arrays using a PriorityQueue
    }

//    public static void top3Largest(Stream<Integer> numbers) {
//        // Given a stream of integers, maintain the top 3 largest numbers seen so far using a min-heap (PriorityQueue)
//    }

    public static void checkPalindrome(String str) {
        // Check if a given string is a palindrome using an ArrayDeque (compare first and last)
    }

    public static void simulateBrowserNavigation() {
        // Simulate browser navigation (Back/Forward) using two ArrayDeque objects
    }

    public static void removeOddLength(ArrayList<String> list) {
        // Iterate over an ArrayList<String> using an Iterator
        // Remove all elements whose length is odd
    }

    public static void sumEvenNumbers(HashSet<Integer> set) {
        // Use an Iterator to traverse a HashSet<Integer> and compute the sum of all even numbers
        // without using for-each
    }

    public static void insertBeforeEven(ArrayList<Integer> list) {
        // Write a program to insert an element before each even number in an ArrayList using ListIterator
    }

    public static void reverseList(ArrayList<Integer> list) {
        // Reverse a list in-place using ListIterator only (no Collections.reverse())
    }

    public static void findMedian(ArrayList<Integer> list) {
        // Given an ArrayList<Integer>, use Collections methods to find the median element after sorting
    }

    public static void shuffleAndPick(List<String> deck) {
        // Shuffle a deck of cards (List<String>) using Collections.shuffle()
        // Pick random 5 cards for a player
    }

    public static void sortEmployees(List<Employee> employees) {
        // Create a list of Employee(id, name, salary)
        // Sort first by descending salary, then by name alphabetically if salaries are equal
    }

    public static void sortStudents(List<Student> students) {
        // Sort a list of Students by grade
        // If two students have the same grade, sort by the number of subjects they’ve taken
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

//        simulateLRUCache();
//        simulateAPICallOrder();
//
//        evaluatePostfix("23*54*+9-");
//        infixToPostfix("(A+B)*C");
//
//        List<int[]> arrays = Arrays.asList(new int[]{1, 4, 7}, new int[]{2, 5, 8}, new int[]{3, 6, 9});
//        mergeKSortedArrays(arrays);
//
//        top3Largest(Arrays.asList(10, 30, 5, 70, 50, 90).stream());
//
//        checkPalindrome("madam");
//
//        simulateBrowserNavigation();
//
//        removeOddLength(new ArrayList<>(Arrays.asList("hi", "there", "yes", "no")));
//
//        sumEvenNumbers(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)));
//
//        insertBeforeEven(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6)));
//
//        reverseList(new ArrayList<>(Arrays.asList(10, 20, 30, 40)));
//
//        findMedian(new ArrayList<>(Arrays.asList(5, 1, 9, 3, 7)));
//
//        List<String> deck = new ArrayList<>(Arrays.asList("A♠", "K♠", "Q♠", "J♠", "10♠", "9♠"));
//        shuffleAndPick(deck);
//
//        List<Employee> employees = Arrays.asList(
//                new Employee(1, "Alice", 90000),
//                new Employee(2, "Bob", 85000),
//                new Employee(3, "Charlie", 90000)
//        );
//        sortEmployees(employees);
//
//        List<Student> students = Arrays.asList(
//                new Student("Tom", 90, Arrays.asList("Math", "Science")),
//                new Student("Jerry", 90, Arrays.asList("Math")),
//                new Student("Anna", 85, Arrays.asList("English", "History", "Science"))
//        );
//        sortStudents(students);
    }
}