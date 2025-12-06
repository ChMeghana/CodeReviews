package arrays;

public class ArrayPrograms {


    public static void frequency(int[] arr){
        int[] freq=new int[arr.length];
        int[] visited=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j] ) {
                    count++;
                    freq[j]=-1;
                }

            }
            if(freq[i]!=-1) {
                freq[i]=count;
            }

        }
        System.out.println();
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=-1)
            System.out.println(arr[i]+" "+freq[i]);

        }

    }
    public static void main(String[] args)
    {
        int[] array=new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        System.out.println("Copying Elements from one array to other");
        int[] arraycopy=new int[array.length];
        for(int i=0;i<array.length;i++) {
            arraycopy[i] = array[i];
            System.out.print(arraycopy[i]+" ");
        }
        System.out.println("Frequency of Elements");
        frequency(array);

    }
}
