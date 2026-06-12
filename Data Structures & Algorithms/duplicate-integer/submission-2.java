class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.Set<Integer> seen= new java.util.HashSet<>();
        boolean flag=false;
        for(int num:nums){
            if(seen.contains(num)){
                flag=true;
            }
            else{
                seen.add(num);
            }
        }
        return flag;
    }
}