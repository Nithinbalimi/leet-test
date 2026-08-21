class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int sum1=0,sum2=0,ans=0;
        for(int i=0;i<firstWord.length();i++){
            int digit=firstWord.charAt(i)-'a';
            sum1=(sum1*10)+digit;
        }
        for(int i=0;i<secondWord.length();i++){
            int digit=secondWord.charAt(i)-'a';
            sum2=(sum2*10)+digit;
        }
        for(int i=0;i<targetWord.length();i++){
            int digit=targetWord.charAt(i)-'a';
            ans=(ans*10)+digit;
        }
        return(sum1+sum2)==ans;
    }
}