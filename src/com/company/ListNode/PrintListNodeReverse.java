package com.company.ListNode;

/**
 * Created by wsx on 2018/1/17.
 * 输入一个链表的头结点，从尾到头反过来打印出每个结点的值。
 */
public class PrintListNodeReverse {
    public static void printListNodeReverse(ListNode head){
       if (head!=null){
            if(head.nextNode!=null){
                printListNodeReverse(head.nextNode);
            }
        }
        System.out.print(head.data+" ");
    }
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
        printListNodeReverse(head);

    }
}
