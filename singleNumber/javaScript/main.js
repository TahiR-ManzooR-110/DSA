var singleNumber = function(nums) {
    let obj={};
    for(let i=0;i<nums.length;i++){
        if(obj[nums[i]]==undefined){
            obj[nums[i]]=1;
        }else{
            obj[nums[i]]++;
        }
    }
    for(let i in obj){
        if(obj[i]==1){
            return i;
        }
    }
};