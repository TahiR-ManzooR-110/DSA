var isAnagram = function(s, t) {
    let str1=[...s];
    let str2=[...t];
    if(str1.length != str2.length)
        return false;
    str1=str1.sort();
    str2=str2.sort();
    for(let i=0;i<str1.length;i++){
        if(str1[i] != str2[i])
            return false;
    }
    return true;
};