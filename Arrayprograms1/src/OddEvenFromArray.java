public class OddEvenFromArray {


        public static void main(String[] args) {
            int[] arr = {12, 23, 11, 64, 5, 87, 22, 67, 100};

            System.out.println("Even numbers are:");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) { // even number condition
                    System.out.print(arr[i] + " ");
                }
            }

            System.out.println("\nOdd numbers are:");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) { // odd number condition
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }


