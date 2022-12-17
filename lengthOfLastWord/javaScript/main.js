var lengthOfLastWord = function(s) {
    let res=s.trim().split(" ");
    let ans=res[res.length-1];
    return ans.length;
};