public class IndividualCharacters
{
    public static void main(String[] args) {
        String string = "characters and string with code work in java mode";

        //Displays individual characters from given string
        System.out.println("Individual characters from given string: ");

        //Iterate through the string and display individual character
        for(int i = 0; i < string.length(); i++){
            System.out.print(string.charAt(i) + " ");
        }
    }
}
