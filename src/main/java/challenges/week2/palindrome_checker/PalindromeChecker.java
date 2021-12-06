package challenges.week2.palindrome_checker;

public class PalindromeChecker {
    private String str;

    public PalindromeChecker(String str) {
        this.str = str.trim().toLowerCase();
    }

    public boolean isAPalindrome() {
        str = str.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = str.length(); i > 0; i--) {
            sb.append(str.charAt(i - 1));
        }
        return sb.toString().equals(this.str);
    }

    public int count() {
        int count = 0;
        str = this.str.replaceAll(",", "").replaceAll("\\.", "");
        for (String word : str.split(" ")) {
            if (new PalindromeChecker(word).isAPalindrome()){
                count++;
            }
        }
        return count;
    }
}
