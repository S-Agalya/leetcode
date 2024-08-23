class Search_in_sortedarray {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
            
        }
        return -1;
        
    }
}

// int[] nums = {4, 2, 7, 1, 3};
// int target = 7;