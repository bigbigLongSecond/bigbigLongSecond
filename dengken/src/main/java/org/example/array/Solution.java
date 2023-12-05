package org.example.array;

import org.example.utils.ArrayUtil;
import org.example.utils.ListNode;

/**
 * @Description
 * @Author sanduo
 * @Date 2023/12/5 18:08
 * @Version 1.0
 */
public class Solution {

    public static void main(String[] args) {
        ListNode list1 = ArrayUtil.getListNode(1, 2, 4, 5);
        ListNode list2 = ArrayUtil.getListNode(3, 7);
        Solution solution = new Solution();
        solution.mergeTwoLists(list1 , list2);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode listNode = new ListNode();
//        ListNode pre = listNode;
//        while (list1 != null && list2 != null) {
//            if (list1.val < list2.val) {
//                pre.next = new ListNode(list1.val);
//                pre = pre.next;
//                list1 = list1.next;
//            } else {
//                pre.next = new ListNode(list2.val);
//                pre = pre.next;
//                list2 = list2.next;
//            }
//        }
//        if (list1 != null) {
//            pre.next = list1;
//        }
//        if (list2 != null) {
//            pre.next = list2;
//        }
        // 虚拟头结点
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = list1, p2 = list2;

        while (p1 != null && p2 != null) {

            // 比较 p1 和 p2 两个指针
            // 将值较小的的节点接到 p 指针
            if (p1.val > p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            // p 指针不断前进
            p = p.next;
        }

        if (p1 != null) {
            p.next = p1;
        }

        if (p2 != null) {
            p.next = p2;
        }

        return dummy.next;
    }
}
