class S19 {
  
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length  = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if(n == length){
            return head.next;
        }
        int i = 0;
        int iToIndex = length-n;
        ListNode first = head;
        ListNode prev = null;
        while (i < iToIndex) {
            prev = first;
            first = first.next;
            i++;
        }
        if (prev != null) {
            prev.next = first.next;
        } else {
            head = head.next;
        }
        return head;
    }
}
