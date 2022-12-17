class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s=s.strip()
        strng = s.split(" ")
        res = strng[len(strng)-1]
        return len(res)