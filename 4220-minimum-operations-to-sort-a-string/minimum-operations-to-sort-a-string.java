class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) return 0;
        
        if (n == 2) return -1;
        
        char minChar = arr[0], maxChar = arr[0];
        for (char c : arr) {
            minChar = (char) Math.min(minChar, c);
            maxChar = (char) Math.max(maxChar, c);
        }
        
        boolean minAtStart = (arr[0] == minChar);
        boolean maxAtEnd = (arr[n - 1] == maxChar);
        
        if (minAtStart || maxAtEnd) {
            return 1;
        }

        boolean hasMinInProperPrefix = false;
        boolean hasMaxInProperSuffix = false;
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == minChar) hasMinInProperPrefix = true;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] == maxChar) hasMaxInProperSuffix = true;
        }
        
        if (!hasMinInProperPrefix && !hasMaxInProperSuffix) {
            return 3;
        }
        
        return 2;
    }
}