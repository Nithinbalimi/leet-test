class Solution {
    public boolean canAliceWin(int n) {
        // if(n<19){
        //     return false;
        // }
        // return true;
        int remove = 10;
        boolean aliceTurn =false;

        while (n >= remove && remove > 0) {
            n -= remove;
            remove--;
            aliceTurn = !aliceTurn;
        }

        // The player whose turn it is when no valid move remains loses,
        // so the opposite player wins.
        return aliceTurn;
    }
}