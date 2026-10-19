class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int countL = 0;
        int countE = 0;        
        for (int num : nums) {
            if (num < target) {
                countL++;
            } else if (num == target) {
                countE++;
            }
        }       
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < countE; i++) {
            result.add(countL + i);
        }        
        return result;
    }
}