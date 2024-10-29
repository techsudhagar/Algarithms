
public class TwoPointers {
  public static boolean isPalindrome(String s) {

    int length = s.length();

    double maxLen = 2 * Math.pow(10, 5);

    if (length < 1 && length > maxLen) {
      return false;
    }

    int j = length - 1;
    for (int i = 0; i < length; i++) {

      if (i == j || i > j) {
        return true;
      }

      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }

      j--;
    }

    return false;
  }

  public static void main(String[] args) {

    if (TwoPointers.isPalindrome("kayak")) {
      System.out.println("It is a polindrome");
    } else {
      System.out.println("It is not a polindrome");
    }
  }
}
