var containsDuplicate = function(nums) {
    let set = new Set();
    return nums.some(el => {
        if (set.has(el)){
            return true;
        }
        set.add(el);
    });
};