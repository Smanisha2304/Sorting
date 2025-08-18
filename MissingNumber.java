class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0)
        {
            return nums.length;
        }
        int st = 0;
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1]+1)
        {
            
            return nums[i-1]+1;
        }
        st = i;

        }
        if(st==nums.length-1)
        {
            if(nums.length==1)
            {
                if(nums[nums.length-1]!=0)
                {
                     return nums[nums.length-1]-1;
                }
                else{
                    return nums[st]+1;
                }
            }
            else
            {
                if(nums[0]!= 0)
                {
                    return 0;
                }
            }
           
        }
        return nums.length;
    }
}