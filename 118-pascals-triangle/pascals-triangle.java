class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows <= 0) {
            return triangle;
        }
        
        // The first row is always just [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currRow = new ArrayList<>();
            
            // Every row starts with 1
            currRow.add(1);
            
            // Each interior element is the sum of the two elements above it
            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            // Every row ends with 1
            currRow.add(1);
            
            triangle.add(currRow);
        }
        
        return triangle;
    }
}