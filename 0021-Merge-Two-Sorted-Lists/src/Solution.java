public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        int head1 = l1.val;
        int head2 = l2.val;

        ListNode result;

        while (true) {
            if (head1 < head2) {
                result = new ListNode(head1);
            } else if (head1 > head2) {

            }
        }
    }
}
