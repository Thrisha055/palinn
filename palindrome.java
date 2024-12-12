public class Palindrome {
    public static void main(String[] args) {
        // Hardcoded input string
        String str = "madam";  // Change this value to test other strings
        
        // Convert string to lower case to make it case-insensitive
        str = str.toLowerCase();
        
        // Variable to store the reversed string
        String reversedStr = "";
        
        // Loop through the string from the end to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        
        // Check if the original string is equal to its reversed version
        if (str.equals(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
