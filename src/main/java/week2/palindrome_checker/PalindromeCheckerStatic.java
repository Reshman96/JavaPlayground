package week2.palindrome_checker;

public class PalindromeCheckerStatic {

    public static boolean isAPalindrome(String str) {
        String str1 = str.trim().toLowerCase().replaceAll(" ", "");
        StringBuilder sb = new StringBuilder(str1.length());
        for (int i = str1.length(); i > 0; i--) {
            sb.append(str1.charAt(i - 1));
        }
        return sb.toString().equals(str1);
    }

    public static int count(String str) {
        int count = 0;
        String str1 = str.trim().toLowerCase().replaceAll(",", "").replaceAll("\\.", "");
        for (String word : str1.split(" ")) {
            if (new PalindromeChecker(word).isAPalindrome()){
                count++;
            }
        }
        return count;
    }
}
