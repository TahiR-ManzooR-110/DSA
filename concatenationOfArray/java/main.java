class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res=nums;
        int[] ans=new int[res.length+nums.length];
        int i = 0;
        for (int e : nums) {
            ans[i] = e;
            i++;
        }
        for (int e : res) {
            ans[i] = e;
            i++;
        }
        return ans;
    }
}