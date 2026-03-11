/**MAIN CLASS UseCase Palindrome CheckerApp
Use Case 5:   Stack-Based Palindrome Checker
 * @author Developer
* @version 5.0**/
public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";
        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;


        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}