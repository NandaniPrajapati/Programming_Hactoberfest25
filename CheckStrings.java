//Check if two strings are same or not
public class Check {
    // Function to compare both strings directly
    public static boolean areStringsSame(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abcd";

        // Call the areStringsSame function to compare strings
        if (areStringsSame(s1, s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
