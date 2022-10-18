public class CharAt1 {
    public static void main(String[] args) {
        String str = "Welcome to Javatpoint portal";
        int strLength = str.length();
        // Fetching first character
        System.out.println("Character at 0 index is: " + str.charAt(0));
        // The last Character is present at the string length-1 index
        System.out.println("Character at last index is: " + str.charAt(strLength - 1));
        for (int i = 0; i <= str.length() - 1; i++) {
            if (i % 2 != 0) {
                System.out.println("Char at " + i + " place " + str.charAt(i));
            }
        }
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 't') {
                count++;
            }
        }
        System.out.println("Frequency of t is: "+count);
    }
}