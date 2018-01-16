package com.company.ListNode;

import com.company.ListNode.ListNode;

/**
 * Created by wsx on 2018/1/12.
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按照递增排序的
 */
public class MergListNode {
    public static void main(String[] args){
        ListNode head1=new ListNode();
        ListNode second1=new ListNode();
        ListNode head2=new ListNode();
        ListNode second2=new ListNode();
        ListNode third2=new ListNode();
        head1.nextNode=second1;
        head2.nextNode=second2;
        second2.nextNode=third2;
        head1.data=1;
        second1.data=4;
        head2.data=2;
        second2.data=3;
        third2.data=5;
        ListNode merageHeadNode=meragListNode(head1,head2);
        while (merageHeadNode!=null){
            System.out.print(merageHeadNode.data+" ");
            merageHeadNode=merageHeadNode.nextNode;
        }
    }

    public static ListNode meragListNode(ListNode listNode1,ListNode listNode2){
        ListNode merageHeadNode=null;
        if(listNode1==null){
            return listNode2;
        }
        if(listNode2==null){
            return listNode1;
        }
        if(listNode1.data<listNode2.data){
            merageHeadNode=listNode1;
            merageHeadNode.nextNode=meragListNode(listNode1.nextNode,listNode2);
        }else{
            merageHeadNode=listNode2;
            merageHeadNode.nextNode=meragListNode(listNode1,listNode2.nextNode);
        }
        return merageHeadNode;

    }
}
