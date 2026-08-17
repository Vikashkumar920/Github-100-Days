class Solution {
    public int reverseBits(int n) {
       int bits[] = new int[32];
       int temp = n;
       int i = 0;
       while(temp != 0){
        int digit = temp % 2;
         bits[i++] = digit;
        temp /=2;
       }
       int ans = 0;
       int k = 0;
      for(i = bits.length-1;i>=0;i--){
        int bit = bits[i];
        ans +=Math.pow(2,k++) * bit;
      }
       return ans;
    }
}