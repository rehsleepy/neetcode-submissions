class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> l1= new ArrayList<>();
        boolean hasDuplicate=false;
        for(int num:nums){
            if(l1.contains(num)){
                hasDuplicate=true;
                break;
            }
            else{
                l1.add(num);
            }
        }
        return hasDuplicate;
    }
}