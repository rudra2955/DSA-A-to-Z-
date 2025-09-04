/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];
        
       
        for (int i = 0; i < m; i++) {
            Arrays.fill(res[i], -1);
        }
        
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        
        while (head != null && top <= bottom && left <= right) {
            
            for (int j = left; j <= right && head != null; j++) {
                res[top][j] = head.val;
                head = head.next;
            }
            top++;
            
         
            for (int i = top; i <= bottom && head != null; i++) {
                res[i][right] = head.val;
                head = head.next;
            }
            right--;
            
            
            for (int j = right; j >= left && head != null; j--) {
                res[bottom][j] = head.val;
                head = head.next;
            }
            bottom--;
            
            
            for (int i = bottom; i >= top && head != null; i--) {
                res[i][left] = head.val;
                head = head.next;
            }
            left++;
        }
        
        return res;
    }
}
