// https://leetcode.com/problems/maximum-population-year/

public class MaximumPopulation {
	public static void main(String[] args) {
		int logs[][] = {{1950,1961},{1960,1971},{1970,1981}};
		System.out.println(maximumPopulation2(logs));
	}

	public static int maximumPopulation(int[][] logs) {
        int year = 0;
        int max = 0;
        int n = logs.length;
        for(int y = 1950; y <= 2050; y++) {
        	int count = 0;
        	for(int i = 0; i<n; i++) {
        		if(y >= logs[i][0] && y < logs[i][1])
        			count++;
        	}
        	if(count > max) {
        		max = count;
        		year = y;
        	}
        }
        return year;
    }

    public static int maximumPopulation2(int[][] logs) {
    	int year[] = new int[101];

    	// Preparing array for doing prefix sum 
    	for(int[] log : logs) {
    		year[log[0] - 1950] += 1;
    		year[log[1] - 1950] -= 1;
    	}

    	int maxPop = year[0], ans = 1950;
    	for(int i = 1; i < 101; i++) {
    		year[i] += year[i-1];

    		if(year[i] > maxPop) {
    			maxPop = year[i];
    			ans = i + 1950;
    		}
    	}

    	return ans;
    }
}
