import java.io.*;

public class Demo2 {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("C:\\Users\\ganes\\OneDrive\\Desktop\\PPT\\untitled2\\src\\Strings\\input.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("line: " + br.readLine());
            br.close();
            int[] arr = new int[10];
            System.out.println(arr[10]);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found. Check the path.");
        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }
}
