/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode* slow=head;
        ListNode *fast=head;
        while(fast!=NULL && fast->next!=NULL){
            slow=slow->next;
            fast=fast->next->next;
            if(slow==fast){    // check loop present
             slow=head;      // again slow start from head
             while(slow!=fast){   // check loop present or not
                slow=slow->next;
                fast=fast->next;
             }
             return slow;
        }
    }
        return NULL;
    }
    
};