class Solution {
    public int[] plusOne(int[] digits) {
        int lastelement=digits[digits.length-1];
        digits[digits.length-1]=lastelement+1;
        int[] result=new int[digits.length];
        for(int i=0;i<=digits.length-1;i++){
            result[i]=digits[i];
        }
        return result;
    }
}


// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].