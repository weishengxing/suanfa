package com.company.ListNode;

/**
 * Created by wsx on 2018/1/20.
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class CommonNode {
    public static ListNode commonNode(ListNode listNode1, ListNode listNode2) {
        int lenth1 = getListNodeLength(listNode1);
        int lenth2 = getListNodeLength(listNode2);
        ListNode longListNode = null;
        ListNode shortListNode = null;
        int dif = 0;
        if (lenth1 > lenth2) {
            longListNode = listNode1;
            shortListNode = listNode2;
            dif = lenth1 - lenth2;
        } else {
            longListNode = listNode2;
            shortListNode = listNode1;
            dif = lenth2 - lenth1;
        }
        for (int i = 0; i < dif; i++) {
            longListNode = longListNode.nextNode;
        }
        while (shortListNode != null && longListNode != null && shortListNode != longListNode) {
            shortListNode = shortListNode.nextNode;
            longListNode = longListNode.nextNode;
        }
        return shortListNode;
    }

    public static int getListNodeLength(ListNode head) {
        int length = 0;
        while (head != null) {
            head = head.nextNode;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode();
        ListNode second1 = new ListNode();
        ListNode third1 = new ListNode();
        ListNode forth1 = new ListNode();
        ListNode fifth1 = new ListNode();
        ListNode head2 = new ListNode();
        ListNode second2 = new ListNode();
        ListNode third2 = new ListNode();
        ListNode forth2 = new ListNode();
        head1.nextNode = second1;
        second1.nextNode = third1;
        third1.nextNode = forth1;
        forth1.nextNode = fifth1;
        head2.nextNode = second2;
        second2.nextNode = forth1;
        third2.nextNode = fifth1;
        head1.data = 1;
        second1.data = 2;
        third1.data = 3;
        forth1.data = 6;
        fifth1.data = 7;
        head2.data = 4;
        second2.data = 5;
        third2.data = 6;
        forth2.data = 7;
        System.out.println(commonNode(head1, head2).data);
    }
}
