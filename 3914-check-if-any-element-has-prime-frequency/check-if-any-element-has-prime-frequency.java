import java.util.*;
import java.util.Map.*;
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int c=map.get(nums[i]);
                map.put(nums[i],c+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int f=0;
        Set<Entry<Integer,Integer>> e=map.entrySet();
        for(Entry<Integer,Integer> x : e){
            if(isPrime(x.getValue())){
                f=1;
            }
        }if(f!=0){
            return true;
        }
        return false;
    }
    public static boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                return false;
            }
        }return true;
    }
}