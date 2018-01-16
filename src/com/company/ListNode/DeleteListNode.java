package com.company.ListNode;

import com.company.ListNode.ListNode;

/**
 * Created by wsx on 2018/1/11.
 *给定单向链表的头指针和一个结点指针，定义一个函数在 O(1)时间删除该结点。
 */
public class DeleteListNode {
    public static void main(String[] args){
        ListNode head=new ListNode();
        ListNode second=new ListNode();
        ListNode third=new ListNode();
        head.nextNode=second;
        second.nextNode=third;
        head.data=1;
        second.data=2;
        third.data=3;
        deleteListNode(head,third);
        while (head!=null){
            System.out.println(head.data);
            head=head.nextNode;
        }

    }

    public static void deleteListNode(ListNode head,ListNode deListNode){
        if(head==null||deListNode==null){
            return;
        }
        if(head==deListNode){//删除头节点
           head=null;
        }else {
            if(deListNode.nextNode==null) { //删除尾结点
                ListNode pointListNode=head;
                while(pointListNode.nextNode.nextNode!=null) {
                    pointListNode=pointListNode.nextNode;
                }
                pointListNode.nextNode=null;
            } else {
                deListNode.data=deListNode.nextNode.data;
                deListNode.nextNode=deListNode.nextNode.nextNode;
            }
        }

    }

}
