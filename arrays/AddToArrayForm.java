package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {
    public static void main(String[] args) {
        int k = 912, num[] = { 1, 2, 3 };
        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        List<Integer> res = new ArrayList<>(n);
        int i = n - 1;
        while (i >= 0 || k > 0) {
            k += num[i];
            res.add(k % 10);
            k /= 10;
        }
        Collections.reverse(res);
        return res;
    }
}
