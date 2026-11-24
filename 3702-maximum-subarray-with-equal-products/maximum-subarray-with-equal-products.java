class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            long prod = 1L;
            int gcd = 0;
            long lcm = 1L;

            for (int j = i; j < n; j++) {
                int val = nums[j];
                prod *= val;
                gcd = gcd(gcd, val);
                lcm = lcm(lcm, val);

                if (prod == lcm * gcd) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return (a / gcd((int) a, (int) b)) * b; 
    }
}