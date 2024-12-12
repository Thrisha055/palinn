public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String str = nextLine();
        String reversedStr="";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        
        if (str.equals(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
