package arrays;

public class FlipAndInvertImage {
    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };
        for (int[] sub : arr) {
            for (int val : sub) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        int res[][] = flipAndInvertImage(arr);
        System.out.println("image after flip");
        for (int[] sub : res) {
            for (int val : sub) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j * 2 < n; j++) {
                // trick to flip that value from 1 to 0 and 0 to 1
                image[i][j] = 1 - image[i][j];
                image[i][n - j - 1] = 1 - image[i][n - j - 1];

                int temp = image[i][j];
                image[i][j] = image[i][n - j - 1];
                image[i][n - j - 1] = temp;
            }
        }

        if (n % 2 == 1) {
            int half = n / 2;
            for (int i = 0; i < n; i++) {
                image[i][half] = 1 - image[i][half];
            }
        }
        return image;
    }
}