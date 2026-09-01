class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> sh=new HashSet<>();
        for(int a:nums)
        {
            if(!sh.add(a)){
               return true;
            }
            
        }
      return false;
    }
}