class Solution {
    public boolean containsDuplicate(int[] nums) {
        int length=nums.length;
        for(int i=0;i<length;i++)
        {
            
            for(int j=i+1;j<length;j++)
            {
                if(nums[i]==nums[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
}
