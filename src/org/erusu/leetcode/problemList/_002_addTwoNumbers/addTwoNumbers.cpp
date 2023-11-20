struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    // Written with jyarijarla
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode * beginValue = nullptr;
        bool carry = false;
        while(continueC(l1, l2) || carry) {
            ListNode * nextNode = new ListNode();

            // Summation
            int sum = 
                (l1 == nullptr ? 0 : l1->val) + 
                (l2 == nullptr ? 0 : l2->val) + 
                (carry ? 1 : 0);
            nextNode->val = sum % 10;
            carry = sum > 9;

            // Add to list
            if(beginValue == nullptr)
                beginValue = nextNode;
            else {
                ListNode * traverseNode = beginValue;
                while(traverseNode->next != nullptr)
                    traverseNode = traverseNode->next;
                traverseNode->next = nextNode;
            }
            if(l1 != nullptr)
                l1 = l1->next;
            if(l2 != nullptr)
                l2 = l2->next;
        }
        return beginValue;
    }

    bool continueC(ListNode * l1, ListNode * l2) {
        return !(l1 == nullptr && l2 == nullptr);
    }
};