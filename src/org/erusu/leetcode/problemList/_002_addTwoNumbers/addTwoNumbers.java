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
            ListNode nextNode = new ListNode();
            int nextVal = l1.val + l2.val;
            nextNode.val = nextVal % 10;
            if(nextVal > 9) {
                if(l1.next == null)
                    l1.next = new ListNode(1);
                else if(l2.next == null)
                    l2.next = new ListNode(1);
                else
                    l1.next.val++;
            }
            nextNode.next = addTwoNumbers(l1.next, l2.next);
            return nextNode;
        }
    }
}