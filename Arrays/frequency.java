package Arrays;

public class frequency {
    public static void main(String[] args) {

        int[] a= new int[]{1,2,2,2,3,3,4,4,4,4,5};
        boolean[] visited = new boolean[a.length];
        for (int i=0;i<a.length;i++){
            int count=0;
            if (visited[i]) continue;
            for (int j=0;j<a.length;j++){
                if (a[i]==a[j]){
                    count=count+1;
                    visited[j]=true;
                }

            }

            System.out.println("Count of "+a[i]+" :"+count);





        }
    }
}
