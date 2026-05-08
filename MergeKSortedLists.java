import java.util.*;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode n : lists) {
            if (n != null) {
                pq.add(n);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (!pq.isEmpty()) {
            ListNode n = pq.poll();
            curr.next = n;
            curr = curr.next;
            if (n.next != null) {
                pq.add(n.next);
            }
        }
        return dummy.next;
    }
}
