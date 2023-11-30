/**
 * Author: Louie Liu
 * Time: 2023/11/25 3:34
 */
public class Solution_4 {
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (true) {
            if (slow.next == null || fast.next == null || fast.next.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

    }

    public static void test1() {
        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(0);
        ListNode a4 = new ListNode(-4);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a2;

        boolean r = hasCycle(a1);
        if (r) {
            System.out.println("test1 pass.");
        } else {
            System.out.println("test1 failed.");
        }
    }

    public static void test2() {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        a1.next = a2;
        a2.next = a1;

        boolean r = hasCycle(a1);
        if (r) {
            System.out.println("test2 pass.");
        } else {
            System.out.println("test2 failed.");
        }
    }

    public static void test3() {
        ListNode a1 = new ListNode(1);

        boolean r = hasCycle(a1);
        if (!r) {
            System.out.println("test3 pass.");
        } else {
            System.out.println("test3 failed.");
        }
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }
}

