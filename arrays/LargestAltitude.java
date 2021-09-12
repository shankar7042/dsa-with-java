package arrays;

public class LargestAltitude {
    public static void main(String[] args) {
        int arr[] = { -4, -3, -2, -1, 4, 3, 2 };
        System.out.println(largestAltitude(arr));
    }

    public static int largestAltitude(int[] gain) {
        int max = 0, sum = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
