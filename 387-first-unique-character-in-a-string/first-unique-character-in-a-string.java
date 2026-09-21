import java.util.Map.*;
class Solution {
    public int firstUniqChar(String s) {
       LinkedHashMap<Character,Integer> map=new LinkedHashMap();
       for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int c=map.get(s.charAt(i));
                map.put(s.charAt(i),c+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
       }
       Set<Entry<Character,Integer>> e=map.entrySet();
       for(Entry<Character,Integer> x : e){
        if(x.getValue()==1){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==x.getKey()){
                    return i;
                }
            }
        }
       }return -1;
    }
}