public class DuplicateChars {
    public static void main(String[] args) {
        String str = "programming";
        str = str.toLowerCase();
        boolean[] visited = new boolean[256];
        System.out.print("Duplicate characters: ");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!visited[c] && str.indexOf(c) != str.lastIndexOf(c)) {
                System.out.print(c + " ");
                visited[c] = true;
            }
        }
    }
}
















