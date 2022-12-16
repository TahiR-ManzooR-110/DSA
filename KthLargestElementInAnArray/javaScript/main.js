var findKthLargest = function(nums, k) {
    nums.sort(function(a, b){
        return a-b;
    });
    return nums[nums.length-k];
};