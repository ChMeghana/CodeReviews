public class Printarray {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1000, 22, 33, 54, 5,56,89,778};
        System.out.println("Elements of given array: ");
        //Loop through the array by incrementing value of i
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
