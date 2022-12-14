class Solution {
    public boolean isHappy(int n) {
        Set<Integer> aSet = new HashSet<>();
        
        while (aSet.add(n)) {
            int sum = 0;
            while (n > 0) {
                int temp = n%10;
                sum += temp * temp;
                n /= 10;
            }
            if (sum == 1)
                return true;
            n = sum;
        }
        return false;
    }
}