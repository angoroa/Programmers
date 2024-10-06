class Solution {
    public int[] solution(long n) {
    String number = String.valueOf(n);
    int n_array [] = new int[number.length()];
    for (int i=0; i<number.length(); i++){
        n_array[i] = number.charAt(number.length()-(i+1))- '0';
        // n[0] = number(4);
        // n[4] = number(0);
    }
        return n_array;
    }
}