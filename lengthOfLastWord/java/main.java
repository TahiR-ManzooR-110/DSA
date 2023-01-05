package DSA.lengthOfLastWord.java;

class Main {
    public int lengthOfLastWord(String s) {
        String[] str = s.trim().split(" ");
        String res = str[str.length - 1];
        return res.length();
    }
}