package org.example.utils;

/**
 * @Description
 * @Author sanduo
 * @Date 2023/12/5 18:26
 * @Version 1.0
 */
public class ArrayUtil {

    public static ListNode getListNode(int... val){
        ListNode listNode = new ListNode() , p = listNode;
        for (int i : val) {
             p.next = new ListNode(i);
             p = p.next;
        }
        return listNode.next;
    }
}
