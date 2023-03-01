public class PalindromikString {
    static boolean isPalindrom(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom("yapay"));
    }
}
