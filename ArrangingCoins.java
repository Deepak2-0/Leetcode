class Solution {
    public int arrangeCoins(int n) {
        int coins=1;
        int stairs =0;
        while(n>=0){
            n = n-coins;
            coins++;
            if(n>=0) stairs++;
            
        }
        return stairs;
        
    }
}