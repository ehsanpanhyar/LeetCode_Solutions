class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
       
        for(int j=0; j<nums.length; j++){
            if(nums[j] != 0){
                nums[k] = nums[j];
                k++;
             }
        }
        for(int i=k; i<nums.length; i++){
            nums[i] = 0;
        }
        return;
    }
}