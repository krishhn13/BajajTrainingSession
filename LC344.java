import java.util.*;
/*
cpp sol i wrote before
class Solution {
public:
    void reverseString(vector<char>& s) {
        int start = 0;
        int end = s.size()-1;
        while(start<end)
        {
            swap(s[start++],s[end--]);
        }
    }
};



*/
class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stack =  new Stack<>();
        for(char c : s){
            stack.push(c);
        }
        for(int i = 0 ;i < s.length;i++){
            s[i] = stack.pop();
        }
    }
}