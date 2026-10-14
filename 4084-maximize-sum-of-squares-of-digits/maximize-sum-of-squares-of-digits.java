class Solution {
    public String maxSumOfSquares(int num, int sum) {
        // If the total sum is too large or negative, it's impossible
        if (sum > 9 * num || sum < 0) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int digit = Math.min(9, sum);
            sb.append(digit);
            sum -= digit;
        }
        
        // If there is still remaining sum left over, return ""
        if (sum > 0) {
            return "";
        }
        
        return sb.toString();
    }
}