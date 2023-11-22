package org.erusu.leetcode.problemList._002_addTwoNumbers;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null)
            return (l1 == null) ? (l2 == null ? null : l2) : l1;
        else {
            int nextVal = l1.val + l2.val;
            if(nextVal > 9) {
                if(l1.next == null)
                    l1.next = new ListNode(1);
                else if(l2.next == null)
                    l2.next = new ListNode(1);
                else
                    l1.next.val++;
            }
            return new ListNode(nextVal % 10, addTwoNumbers(l1.next, l2.next));
        }
    }
}