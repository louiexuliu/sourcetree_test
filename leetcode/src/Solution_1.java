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

        // TODO 填写实现

        return result;
    }

    public static void test1() {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;

        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        b1.next = b2;
        b2.next = b3;

        Solution_1 s = new Solution_1();
        ListNode r = s.mergeTwoLists(a1, b1);

        List<Integer> print = new ArrayList<>();
        while (r != null) {
            print.add(r.val);
            r = r.next;
        }
        System.out.println(print);
    }

    public static void test2() {}

    public static void test3() {}

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