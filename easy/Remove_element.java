import java.util.Arrays;
class Remove_element {
    public int removeElement(int[] nums, int val) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                nums.remove(val);
                //System.out.println(nums);
                return nums;
            }
        }
        
    }
}