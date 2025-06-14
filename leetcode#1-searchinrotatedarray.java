class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1,p=nums[0],m;
        while(l<=r){
            m=l+(r-l)/2;
            if(nums[m]==target){
                return m;
            }
            if(nums[m]<p){
                if(target<nums[m]){
                    r=m-1;
                }
                else{
                    if(target<p){
                        l=m+1;
                    }
                    else{
                        r=m-1;
                    }
                }
            }
            else{
                if(target>nums[m]){
                    l=m+1;
                }
                else{
                    if(target>=p){
                        r=m-1;
                    }
                    else{
                        l=m+1;
                    }
                }
            }
        }
        return -1;
    }
}
