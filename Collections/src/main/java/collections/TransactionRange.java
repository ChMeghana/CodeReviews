package collections;

import java.util.TreeSet; //TreeSet store the Element in shored way

public class TransactionRange {
    public static void main(String[] args) {
        // Example transaction amounts
        int[] transactions = {5000, 12000, 25000, 40000, 60000, 45000, 10000};

        // Step 1: Store in a TreeSet (sorted automatically)
        TreeSet<Integer> transactionSet = new TreeSet<>();
        for (int t : transactions) {
            transactionSet.add(t);
        }

        System.out.println("All transactions: " + transactionSet);

        // Step 2: Get transactions between 10,000 and 50,000
        // subSet(fromElement, toElement) -> from inclusive, to exclusive
        TreeSet<Integer> rangeSet = (TreeSet<Integer>) transactionSet.subSet(10000, 50001);

        // Step 3: Print the values
        System.out.println("Transactions between 10,000 and 50,000: " + rangeSet);
    }
}

