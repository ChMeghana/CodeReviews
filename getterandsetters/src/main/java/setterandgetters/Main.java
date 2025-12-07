package setterandgetters;

public class Main {
    public static void main(String[] args) {

        //  Create a Car object using the constructor
        Cars gtmustang = new Cars("Gt Mustang", "Ford", "Black", 190000);

        // Update price using setter
        gtmustang.setPrice(120000);

        // Print updated price using getter
        System.out.println(gtmustang.getprice());  // Output: 120000

        // Update color using setter
        gtmustang.setcolor("Blue and green");

        // Print updated color using getter
        System.out.println(gtmustang.getcolor());  // Output: Blue and green
    }
}
