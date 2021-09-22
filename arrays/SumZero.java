public class SumZero {
	public static void main(String[] args) {
		int n = 2;
		int res[] = sumZero(n);
		for (int i = 0; i < n; i++) {
			System.out.print(res[i] + " ");
		}
	}

	public static int[] sumZero(int n) {
        int res[] = new int[n], half = n/2;
        int idx = 0;
        for(int i = 1; i <= half; i++) {
        	res[idx++] = -1 * i;
        	res[idx++] = i;
        }

        if(n%2 == 1) {
        	res[idx] = 0;
        }
        return res;
    }
}