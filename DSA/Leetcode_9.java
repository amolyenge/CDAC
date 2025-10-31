
class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes
    if (x < 0 || (x % 10 == 0 && x != 0)) return false;

    int reversedHalf = 0;
    while (x > reversedHalf) {
        int digit = x % 10;
        reversedHalf = reversedHalf * 10 + digit;
        x /= 10;
    }

    // For even digit count: x == reversedHalf
    // For odd digit count: x == reversedHalf / 10
    return x == reversedHalf || x == reversedHalf / 10;
    }
}




// class Solution {
//     public boolean isPalindrome(int x) {
//         int reversed = 0;
//         int original = x;
//         if(x < 0) return false;
//         while(x != 0){
//             int digit = x % 10;
//             reversed = reversed * 10 + digit;
//             x = x / 10;
//         }

//         if(original == reversed){
//             return true;
//         }
//         return false;
//     }
// }
