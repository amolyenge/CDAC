class Solution {
    public int climbStairs(int n) {
        return climbS(n);
    }

    public int climbS(int n){
        if(n <= 1) return 1;

        return climbS(n - 1) + climbS( n - 2);
    }
}
