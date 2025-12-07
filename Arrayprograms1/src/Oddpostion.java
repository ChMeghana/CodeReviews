public class Oddpostion {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {11, 22, 33, 44, 55, 66, 77, 88, 99, 100,};
        System.out.println("Elements of given array present on odd position: ");
        //Loop through the array by incrementing value of i by 2
        for (int i = 0; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }
    }
}
