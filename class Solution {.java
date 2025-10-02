class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] correctNums = new correctNums[2];
       for(i = 0; i < nums.length; i++){
            i = nums[i];
            for(j = i + 1; j < nums.length; j++)
                if(j + i == target){
                    correctNums += i;
                    correctNums += j;
                }
       } 
       return correctNums;
    }
}