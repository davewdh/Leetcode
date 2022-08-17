class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n-1)) == 0);
        
        // if (n <= 0)
        //     return false;
        // if (n == 1)
        //     return true;
        // if (n%2 != 0)
        //     return false;
        // else
        //     return isPowerOfTwo(n/2);
    }
}