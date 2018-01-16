package com.company.ListNode;

import com.company.ListNode.ListNode;

/**
 * Created by wsx on 2018/1/11.
 * 输入一个链表，输出该链表中倒数第 k 个结点。为了符合大多数人的习惯，
 本题从 1 开始计数，即链表的尾结点是倒数第一个结点。例如一个有 6 个结点的
 链表，从头结点依次是 1,2,3,4，5,6。倒数第三个
 结点就是值为 4 的结点。
 */
public class LastKNode {
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
        ListNode resultListNode=findKToTail(head, 2);
        if(resultListNode!=null) {
            System.out.println(resultListNode.data);
        }else{
            System.out.println("倒数第k个节点不存在！");
        }
    }
    public static ListNode findKToTail(ListNode head,int k){
        if(head==null||k==0)
            return null;
        ListNode fastNode=head;
        ListNode lastNode=head;
        while (k-1!=0){
            if(fastNode.nextNode!=null){
                fastNode=fastNode.nextNode;
                k--;
            }else{
                return null;
            }
        }
        while (fastNode.nextNode!=null){
            fastNode=fastNode.nextNode;
            lastNode=lastNode.nextNode;
        }
        return lastNode;
    }
}
