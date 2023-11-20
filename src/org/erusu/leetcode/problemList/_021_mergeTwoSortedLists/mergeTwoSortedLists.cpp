struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};


class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if(list1 == nullptr)
            return list2;
        if(list2 == nullptr)
            return list1;
        
        ListNode * newNode = new ListNode(list1->val <= list2->val ? list1->val : list2->val);
        if(newNode->val == list1->val)
            list1 = list1->next;
        else
            list2 = list2->next;
        
        newNode->next = mergeTwoLists(list1, list2);
        return newNode;
    }
};