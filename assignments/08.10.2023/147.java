import java.util.*;

class S147 {
    public ListNode insertionSortList(ListNode head) {
        int n = size(head);
        int[] temp = new int[n];
        ListNode Temp = head;
        for(int i = 0; i< n ; i++){
            temp[i] = Temp.val;
            Temp = Temp.next;
        }
        Arrays.sort(temp);
        ListNode sortedList = new ListNode(0);
        Temp = sortedList;
        for (int i = 0; i < n; i++) {
            Temp.next = new ListNode(temp[i]);
            Temp = Temp.next;
        }

        return sortedList.next;
    }

    public int size(ListNode head){
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }  
}
