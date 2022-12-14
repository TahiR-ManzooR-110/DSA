class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s) != len(t)):
            return False
        str1=''.join(sorted(s))
        str2=''.join(sorted(t))
        for i in range(0,len(str1)):
            if(str1[i] != str2[i]):
                return False
        return True