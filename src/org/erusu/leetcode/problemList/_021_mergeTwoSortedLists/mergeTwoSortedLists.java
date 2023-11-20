package org.erusu.leetcode.problemList._021_mergeTwoSortedLists;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        
        ListNode newNode = new ListNode(list1.val <= list2.val ? list1.val : list2.val);
        if(newNode.val == list1.val)
            list1 = list1.next;
        else
            list2 = list2.next;
        
        newNode.next = mergeTwoLists(list1, list2);
        return newNode;
    }
};