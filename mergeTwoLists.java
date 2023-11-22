class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode start = new ListNode(0);
        ListNode real = start;

//第一种情况：两个list都不是null
        while(list1!=null && list2!=null){
            //如果list1小于等于list2
            if(list1.val <= list2.val){
                real.next = list1;
                list1 = list1.next;
            }
            //list2大于list1
            else{
                real.next = list2;
                list2 = list2.next;
            }
            real = real.next;
        }
//如果list1不是null，则将real.next设置为list1，否则将其设置为list2
        real.next = list1!=null ? list1 : list2;
        return start.next;
    }
}