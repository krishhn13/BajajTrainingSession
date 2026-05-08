// Best Time to buy and sell stock
class Solution {
    public int maxProfit(int[] arr) {
        int prof = Integer.MIN_VALUE, mini = arr[0];
        for(int i = 1; i < arr.length; i++) {
            mini = Math.min(arr[i-1], mini);
            prof = Math.max(prof, (arr[i] - mini));
        }
        return prof < 0 ? 0 : prof;
    }
}
public class LC121 {
        
}
