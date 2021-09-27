package arrays;

public class CheckIfPangram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram2("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram2("leetcode"));
    }

    public static boolean checkIfPangram(String sentence) {
        int count[] = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            count[sentence.charAt(i) - 'a']++;
        }

        for (int i : count) {
            if (i == 0)
                return false;
        }
        return true;
    }

    public static boolean checkIfPangram2(String sentence) {
        int seen = 0;
        for (char c : sentence.toCharArray()) {
            int ci = c - 'a';
            seen = seen | (1 << ci);
        }
        return seen == ((1 << 26) - 1);
    }
}
