import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String s= Integer.toString(n);
        for(int i=0; i<s.length(); i++){
            answer += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return answer;
    }
}