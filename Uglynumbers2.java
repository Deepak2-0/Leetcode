class Solution {
    public int nthUglyNumber(int n) {
        int ugly[]=new int[n];
        ugly [0]=1;
        int i=2,j=3,k=5;
        int indexOf2 =0,indexOf3=0,indexOf5=0;
        for(int l=1;l<n;l++){
            int min = Math.min(Math.min(i,j),k);
            ugly[l] = min;
            if(i == min)
                    i = 2*ugly[++indexOf2];
            if(j == min)
                    j = 3*ugly[++indexOf3];
            if(k== min)
                    k = 5*ugly[++indexOf5];
        }
        return ugly[n-1];
    }
}