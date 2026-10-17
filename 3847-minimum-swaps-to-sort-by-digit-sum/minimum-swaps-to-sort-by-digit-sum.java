import java.util.Arrays;

class Solution {
    
    private int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;
        
        long[][] items = new long[n][3];
        for (int i = 0; i < n; i++) {
            items[i][0] = getDigitSum(nums[i]);
            items[i][1] = nums[i];
            items[i][2] = i;
        }

        Arrays.sort(items, (a, b) -> {
            if (a[0] != b[0]) {
                return Long.compare(a[0], b[0]);
            }
            return Long.compare(a[1], b[1]);
        });

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || items[i][2] == i) {
                continue;
            }

            int cycleSize = 0;
            int curr = i;
            while (!visited[curr]) {
                visited[curr] = true;
                curr = (int) items[curr][2];
                cycleSize++;
            }

            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }

        return swaps;
    }
}