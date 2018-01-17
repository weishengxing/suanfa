package com.company.ListNode;

import com.company.ListNode.ListNode;

/**
 * Created by wsx on 2017/12/6.
 * 反转链表
 */
public class ReverseList {
    public static void main(String[] args){
        ListNode head=new ListNode();
        ListNode second=new ListNode();
        ListNode third=new ListNode();
        ListNode forth=new ListNode();
        head.nextNode=second;
        second.nextNode=third;
        third.nextNode=forth;
        head.data=1;
        second.data=2;
        third.data=3;
        forth.data=4;
        ListNode resultNode=reverseList(head);
        while (resultNode!=null){
            System.out.print(resultNode.data+"  ");
            resultNode=resultNode.nextNode;
        }
    }

    public static ListNode reverseList(ListNode head){
        if(head==null) {
            return null;
        }
        if(head.nextNode==null) {
            return head;
        }
        ListNode preNode=null;
        ListNode pNode=head;
        ListNode reverseNode=null;
        while (pNode!=null){
            ListNode nextNode=pNode.nextNode;
            if(nextNode==null){
                reverseNode=pNode;
            }
            pNode.nextNode=preNode;
            preNode=pNode;
            pNode=nextNode;
        }


        return reverseNode;
    }
}
