class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String rs=word;
        while(sequence.contains(rs)){
            count++;
            rs+=word;
        }
        return count;
    }
}