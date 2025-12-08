import java.io.FileReader;
import java.io.BufferedReader;


public class NumberOfWords {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\ganes\\OneDrive\\Desktop\\PPT\\untitled2\\src\\Strings\\input.txt"));
        StringBuilder text = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            text.append(line).append(" ");

        }
        br.close();

        String[] words = text.toString().toLowerCase().split("\\W+");

        System.out.println("Number of Words in the file: "+words.length);

    }

}
