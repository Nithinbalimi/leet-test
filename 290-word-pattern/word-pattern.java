class Solution {
    public boolean wordPattern(String pattern, String s) {
       String []t=s.split(" ");
       if(pattern.length() != t.length){
         return false;
       } 
       HashMap<Object,Integer> map=new HashMap();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String w=t[i];
            if(!Objects.equals(map.put(c,i),map.put(w,i))){
                return false;
            }
        }
        return true;
    }
}