// https://leetcode.com/problems/count-items-matching-a-rule/
package arrays;

import java.util.List;

public class CountMatches {
    public static void main(String[] args) {

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index;

        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }
        int count = 0;

        for (List<String> arr : items) {
            if (arr.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
