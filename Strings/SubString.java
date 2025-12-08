class SubString {
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }


    public static void findSubsets(String str, String current, int index) {

        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        findSubsets(str, current + str.charAt(index), index + 1);
        findSubsets(str, current, index + 1);
    }
}
