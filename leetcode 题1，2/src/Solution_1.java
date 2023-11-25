import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution_1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode temp = result;

        list1 = list1.next;
        list2 = list2.next;

        if (list1 == null && list2 == null){
            return result;
        }

        while (list1 != null || list2 != null){
            temp.next = new ListNode();
            temp = temp.next;

            if (list1 == null){
                temp.val = list2.val;
                list2 = list2.next;
                continue;
            }

            if (list2 == null){
                temp.val = list1.val;
                list1 = list1.next;
                continue;
            }

            if (list1.val < list2.val){
                temp.val = list1.val;
                list1 = list1.next;
            }else {
                temp.val = list2.val;
                list2 = list2.next;
            }
        }
        return result;
    }

    public static void printNodelist(ListNode r) {
        List<Integer> print = new ArrayList<>();
        r = r.next;
        while (r != null) {
            print.add(r.val);
            r = r.next;
        }
        System.out.println(print);
        System.out.println("===");
    }

    public static void test1() {
        ListNode a = new ListNode();
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);
        a.next = a1;
        a1.next = a2;
        a2.next = a3;

        ListNode b = new ListNode();
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        b.next = b1;
        b1.next = b2;
        b2.next = b3;

        Solution_1 s = new Solution_1();
        ListNode r = s.mergeTwoLists(a, b);
        printNodelist(r);

    }

    public static void test2() {
        ListNode a = new ListNode();
        ListNode b = new ListNode();

        Solution_1 s = new Solution_1();
        ListNode r = s.mergeTwoLists(a, b);
        printNodelist(r);
    }

    public static void test3() {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode b1 = new ListNode(0);
        b.next = b1;

        Solution_1 s = new Solution_1();
        ListNode r = s.mergeTwoLists(a, b);
        printNodelist(r);
    }

    /**
     * 用文字描述你的思路
     *
     * */
    public static void main(String[] args) {
        // 三组测试都需要完成
        test1();
        test2();
        test3();
    }
}