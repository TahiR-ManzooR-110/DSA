var containsNearbyDuplicate = function(nums, k) {
    let hm={};
    let res=false;
    for(let i=0;i<nums.length;i++){
        if(hm[nums[i]] != undefined && Math.abs(hm[nums[i]]-i)<=k){
            res=true;
        }else{
            hm[nums[i]]=i;
        }
    }
    return res;
};